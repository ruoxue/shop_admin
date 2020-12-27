<template>
  <div class="app-container">
    <el-form :model="queryParams" ref="queryForm" :inline="true" v-show="showSearch" label-width="68px">
      <el-form-item label="商品名称" prop="goodsName">
        <el-input
          v-model="queryParams.goodsName"
          placeholder="请输入商品名称"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="商品分类id" prop="categoryId">
        <el-input
          v-model="queryParams.categoryId"
          placeholder="请输入商品分类id"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="商品规格(10单规格 20多规格)" prop="specType">
        <el-select v-model="queryParams.specType" placeholder="请选择商品规格(10单规格 20多规格)" clearable size="small">
          <el-option label="请选择字典生成" value="" />
        </el-select>
      </el-form-item>
      <el-form-item label="库存计算方式(10下单减库存 20付款减库存)" prop="deductStockType">
        <el-select v-model="queryParams.deductStockType" placeholder="请选择库存计算方式(10下单减库存 20付款减库存)" clearable size="small">
          <el-option label="请选择字典生成" value="" />
        </el-select>
      </el-form-item>
      <el-form-item label="初始销量" prop="salesInitial">
        <el-input
          v-model="queryParams.salesInitial"
          placeholder="请输入初始销量"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="实际销量" prop="salesActual">
        <el-input
          v-model="queryParams.salesActual"
          placeholder="请输入实际销量"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="商品排序(数字越小越靠前)" prop="goodsSort">
        <el-input
          v-model="queryParams.goodsSort"
          placeholder="请输入商品排序(数字越小越靠前)"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="配送模板id" prop="deliveryId">
        <el-input
          v-model="queryParams.deliveryId"
          placeholder="请输入配送模板id"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="商品状态(10上架 20下架)" prop="goodsStatus">
        <el-select v-model="queryParams.goodsStatus" placeholder="请选择商品状态(10上架 20下架)" clearable size="small">
          <el-option label="请选择字典生成" value="" />
        </el-select>
      </el-form-item>
      <el-form-item label="是否删除" prop="isDelete">
        <el-input
          v-model="queryParams.isDelete"
          placeholder="请输入是否删除"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="小程序id" prop="wxappId">
        <el-input
          v-model="queryParams.wxappId"
          placeholder="请输入小程序id"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="小程序id" prop="slider">
        <el-input
          v-model="queryParams.slider"
          placeholder="请输入小程序id"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="小程序id" prop="cover">
        <el-input
          v-model="queryParams.cover"
          placeholder="请输入小程序id"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item>
        <el-button type="cyan" icon="el-icon-search" size="mini" @click="handleQuery">搜索</el-button>
        <el-button icon="el-icon-refresh" size="mini" @click="resetQuery">重置</el-button>
      </el-form-item>
    </el-form>

    <el-row :gutter="10" class="mb8">
      <el-col :span="1.5">
        <el-button
          type="primary"
          icon="el-icon-plus"
          size="mini"
          @click="handleAdd"
          v-hasPermi="['system:goods:add']"
        >新增</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="success"
          icon="el-icon-edit"
          size="mini"
          :disabled="single"
          @click="handleUpdate"
          v-hasPermi="['system:goods:edit']"
        >修改</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="danger"
          icon="el-icon-delete"
          size="mini"
          :disabled="multiple"
          @click="handleDelete"
          v-hasPermi="['system:goods:remove']"
        >删除</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="warning"
          icon="el-icon-download"
          size="mini"
          @click="handleExport"
          v-hasPermi="['system:goods:export']"
        >导出</el-button>
      </el-col>
	  <right-toolbar :showSearch.sync="showSearch" @queryTable="getList"></right-toolbar>
    </el-row>

    <el-table v-loading="loading" :data="goodsList" @selection-change="handleSelectionChange">
      <el-table-column type="selection" width="55" align="center" />
      <el-table-column label="商品id" align="center" prop="goodsId" />
      <el-table-column label="商品名称" align="center" prop="goodsName" />
      <el-table-column label="商品分类id" align="center" prop="categoryId" />
      <el-table-column label="商品规格(10单规格 20多规格)" align="center" prop="specType" />
      <el-table-column label="库存计算方式(10下单减库存 20付款减库存)" align="center" prop="deductStockType" />
      <el-table-column label="商品详情" align="center" prop="content" />
      <el-table-column label="初始销量" align="center" prop="salesInitial" />
      <el-table-column label="实际销量" align="center" prop="salesActual" />
      <el-table-column label="商品排序(数字越小越靠前)" align="center" prop="goodsSort" />
      <el-table-column label="配送模板id" align="center" prop="deliveryId" />
      <el-table-column label="商品状态(10上架 20下架)" align="center" prop="goodsStatus" />
      <el-table-column label="是否删除" align="center" prop="isDelete" />
      <el-table-column label="小程序id" align="center" prop="wxappId" />
      <el-table-column label="更新时间" align="center" prop="slider" />
      <el-table-column label="更新时间" align="center" prop="cover" />
      <el-table-column label="操作" align="center" class-name="small-padding fixed-width">
        <template slot-scope="scope">
          <el-button
            size="mini"
            type="text"
            icon="el-icon-edit"
            @click="handleUpdate(scope.row)"
            v-hasPermi="['system:goods:edit']"
          >修改</el-button>
          <el-button
            size="mini"
            type="text"
            icon="el-icon-delete"
            @click="handleDelete(scope.row)"
            v-hasPermi="['system:goods:remove']"
          >删除</el-button>
        </template>
      </el-table-column>
    </el-table>
    
    <pagination
      v-show="total>0"
      :total="total"
      :page.sync="queryParams.pageNum"
      :limit.sync="queryParams.pageSize"
      @pagination="getList"
    />

    <!-- 添加或修改【请填写功能名称】对话框 -->
    <el-dialog :title="title" :visible.sync="open" width="500px" append-to-body>
      <el-form ref="form" :model="form" :rules="rules" label-width="80px">
        <el-form-item label="商品名称" prop="goodsName">
          <el-input v-model="form.goodsName" placeholder="请输入商品名称" />
        </el-form-item>
        <el-form-item label="商品分类id" prop="categoryId">
          <el-input v-model="form.categoryId" placeholder="请输入商品分类id" />
        </el-form-item>
        <el-form-item label="商品规格(10单规格 20多规格)" prop="specType">
          <el-select v-model="form.specType" placeholder="请选择商品规格(10单规格 20多规格)">
            <el-option label="请选择字典生成" value="" />
          </el-select>
        </el-form-item>
        <el-form-item label="库存计算方式(10下单减库存 20付款减库存)" prop="deductStockType">
          <el-select v-model="form.deductStockType" placeholder="请选择库存计算方式(10下单减库存 20付款减库存)">
            <el-option label="请选择字典生成" value="" />
          </el-select>
        </el-form-item>
        <el-form-item label="商品详情">
          <editor v-model="form.content" :min-height="192"/>
        </el-form-item>
        <el-form-item label="初始销量" prop="salesInitial">
          <el-input v-model="form.salesInitial" placeholder="请输入初始销量" />
        </el-form-item>
        <el-form-item label="实际销量" prop="salesActual">
          <el-input v-model="form.salesActual" placeholder="请输入实际销量" />
        </el-form-item>
        <el-form-item label="商品排序(数字越小越靠前)" prop="goodsSort">
          <el-input v-model="form.goodsSort" placeholder="请输入商品排序(数字越小越靠前)" />
        </el-form-item>
        <el-form-item label="配送模板id" prop="deliveryId">
          <el-input v-model="form.deliveryId" placeholder="请输入配送模板id" />
        </el-form-item>
        <el-form-item label="商品状态(10上架 20下架)">
          <el-radio-group v-model="form.goodsStatus">
            <el-radio label="1">请选择字典生成</el-radio>
          </el-radio-group>
        </el-form-item>
        <el-form-item label="是否删除" prop="isDelete">
          <el-input v-model="form.isDelete" placeholder="请输入是否删除" />
        </el-form-item>
        <el-form-item label="小程序id" prop="wxappId">
          <el-input v-model="form.wxappId" placeholder="请输入小程序id" />
        </el-form-item>
        <el-form-item label="小程序id" prop="slider">
          <el-input v-model="form.slider" placeholder="请输入小程序id" />
        </el-form-item>
        <el-form-item label="小程序id" prop="cover">
          <el-input v-model="form.cover" placeholder="请输入小程序id" />
        </el-form-item>
      </el-form>
      <div slot="footer" class="dialog-footer">
        <el-button type="primary" @click="submitForm">确 定</el-button>
        <el-button @click="cancel">取 消</el-button>
      </div>
    </el-dialog>
  </div>
</template>

<script>
import { listGoods, getGoods, delGoods, addGoods, updateGoods } from "@/api/system/goods";
import Editor from '@/components/Editor';

export default {
  name: "Goods",
  components: {
    Editor,
  },
  data() {
    return {
      // 遮罩层
      loading: true,
      // 选中数组
      ids: [],
      // 非单个禁用
      single: true,
      // 非多个禁用
      multiple: true,
      // 显示搜索条件
      showSearch: true,
      // 总条数
      total: 0,
      // 【请填写功能名称】表格数据
      goodsList: [],
      // 弹出层标题
      title: "",
      // 是否显示弹出层
      open: false,
      // 查询参数
      queryParams: {
        pageNum: 1,
        pageSize: 10,
        goodsName: null,
        categoryId: null,
        specType: null,
        deductStockType: null,
        content: null,
        salesInitial: null,
        salesActual: null,
        goodsSort: null,
        deliveryId: null,
        goodsStatus: null,
        isDelete: null,
        wxappId: null,
        slider: null,
        cover: null
      },
      // 表单参数
      form: {},
      // 表单校验
      rules: {
        goodsName: [
          { required: true, message: "商品名称不能为空", trigger: "blur" }
        ],
        categoryId: [
          { required: true, message: "商品分类id不能为空", trigger: "blur" }
        ],
        specType: [
          { required: true, message: "商品规格(10单规格 20多规格)不能为空", trigger: "change" }
        ],
        deductStockType: [
          { required: true, message: "库存计算方式(10下单减库存 20付款减库存)不能为空", trigger: "change" }
        ],
        content: [
          { required: true, message: "商品详情不能为空", trigger: "blur" }
        ],
        salesInitial: [
          { required: true, message: "初始销量不能为空", trigger: "blur" }
        ],
        salesActual: [
          { required: true, message: "实际销量不能为空", trigger: "blur" }
        ],
        goodsSort: [
          { required: true, message: "商品排序(数字越小越靠前)不能为空", trigger: "blur" }
        ],
        deliveryId: [
          { required: true, message: "配送模板id不能为空", trigger: "blur" }
        ],
        goodsStatus: [
          { required: true, message: "商品状态(10上架 20下架)不能为空", trigger: "blur" }
        ],
        isDelete: [
          { required: true, message: "是否删除不能为空", trigger: "blur" }
        ],
        wxappId: [
          { required: true, message: "小程序id不能为空", trigger: "blur" }
        ],
        createTime: [
          { required: true, message: "创建时间不能为空", trigger: "blur" }
        ],
        updateTime: [
          { required: true, message: "更新时间不能为空", trigger: "blur" }
        ],
      }
    };
  },
  created() {
    this.getList();
  },
  methods: {
    /** 查询【请填写功能名称】列表 */
    getList() {
      this.loading = true;
      listGoods(this.queryParams).then(response => {
        this.goodsList = response.rows;
        this.total = response.total;
        this.loading = false;
      });
    },
    // 取消按钮
    cancel() {
      this.open = false;
      this.reset();
    },
    // 表单重置
    reset() {
      this.form = {
        goodsId: null,
        goodsName: null,
        categoryId: null,
        specType: null,
        deductStockType: null,
        content: null,
        salesInitial: null,
        salesActual: null,
        goodsSort: null,
        deliveryId: null,
        goodsStatus: 0,
        isDelete: null,
        wxappId: null,
        createTime: null,
        updateTime: null,
        slider: null,
        cover: null
      };
      this.resetForm("form");
    },
    /** 搜索按钮操作 */
    handleQuery() {
      this.queryParams.pageNum = 1;
      this.getList();
    },
    /** 重置按钮操作 */
    resetQuery() {
      this.resetForm("queryForm");
      this.handleQuery();
    },
    // 多选框选中数据
    handleSelectionChange(selection) {
      this.ids = selection.map(item => item.goodsId)
      this.single = selection.length!==1
      this.multiple = !selection.length
    },
    /** 新增按钮操作 */
    handleAdd() {
      this.reset();
      this.open = true;
      this.title = "添加【请填写功能名称】";
    },
    /** 修改按钮操作 */
    handleUpdate(row) {
      this.reset();
      const goodsId = row.goodsId || this.ids
      getGoods(goodsId).then(response => {
        this.form = response.data;
        this.open = true;
        this.title = "修改【请填写功能名称】";
      });
    },
    /** 提交按钮 */
    submitForm() {
      this.$refs["form"].validate(valid => {
        if (valid) {
          if (this.form.goodsId != null) {
            updateGoods(this.form).then(response => {
              this.msgSuccess("修改成功");
              this.open = false;
              this.getList();
            });
          } else {
            addGoods(this.form).then(response => {
              this.msgSuccess("新增成功");
              this.open = false;
              this.getList();
            });
          }
        }
      });
    },
    /** 删除按钮操作 */
    handleDelete(row) {
      const goodsIds = row.goodsId || this.ids;
      this.$confirm('是否确认删除【请填写功能名称】编号为"' + goodsIds + '"的数据项?', "警告", {
          confirmButtonText: "确定",
          cancelButtonText: "取消",
          type: "warning"
        }).then(function() {
          return delGoods(goodsIds);
        }).then(() => {
          this.getList();
          this.msgSuccess("删除成功");
        })
    },
    /** 导出按钮操作 */
    handleExport() {
      this.download('system/goods/export', {
        ...this.queryParams
      }, `system_goods.xlsx`)
    }
  }
};
</script>