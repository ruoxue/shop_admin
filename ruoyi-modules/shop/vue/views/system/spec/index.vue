<template>
  <div class="app-container">
    <el-form :model="queryParams" ref="queryForm" :inline="true" v-show="showSearch" label-width="68px">
      <el-form-item label="商品id" prop="goodsId">
        <el-input
          v-model="queryParams.goodsId"
          placeholder="请输入商品id"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="商品编码" prop="goodsNo">
        <el-input
          v-model="queryParams.goodsNo"
          placeholder="请输入商品编码"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="商品价格" prop="goodsPrice">
        <el-input
          v-model="queryParams.goodsPrice"
          placeholder="请输入商品价格"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="商品划线价" prop="linePrice">
        <el-input
          v-model="queryParams.linePrice"
          placeholder="请输入商品划线价"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="当前库存数量" prop="stockNum">
        <el-input
          v-model="queryParams.stockNum"
          placeholder="请输入当前库存数量"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="商品销量" prop="goodsSales">
        <el-input
          v-model="queryParams.goodsSales"
          placeholder="请输入商品销量"
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
      <el-form-item label="商品spu标识" prop="specSkuId">
        <el-input
          v-model="queryParams.specSkuId"
          placeholder="请输入商品spu标识"
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
          v-hasPermi="['system:spec:add']"
        >新增</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="success"
          icon="el-icon-edit"
          size="mini"
          :disabled="single"
          @click="handleUpdate"
          v-hasPermi="['system:spec:edit']"
        >修改</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="danger"
          icon="el-icon-delete"
          size="mini"
          :disabled="multiple"
          @click="handleDelete"
          v-hasPermi="['system:spec:remove']"
        >删除</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="warning"
          icon="el-icon-download"
          size="mini"
          @click="handleExport"
          v-hasPermi="['system:spec:export']"
        >导出</el-button>
      </el-col>
	  <right-toolbar :showSearch.sync="showSearch" @queryTable="getList"></right-toolbar>
    </el-row>

    <el-table v-loading="loading" :data="specList" @selection-change="handleSelectionChange">
      <el-table-column type="selection" width="55" align="center" />
      <el-table-column label="商品规格id" align="center" prop="goodsSpecId" />
      <el-table-column label="商品id" align="center" prop="goodsId" />
      <el-table-column label="商品编码" align="center" prop="goodsNo" />
      <el-table-column label="商品价格" align="center" prop="goodsPrice" />
      <el-table-column label="商品划线价" align="center" prop="linePrice" />
      <el-table-column label="当前库存数量" align="center" prop="stockNum" />
      <el-table-column label="商品销量" align="center" prop="goodsSales" />
      <el-table-column label="商品重量(Kg)" align="center" prop="goodsWeight" />
      <el-table-column label="小程序id" align="center" prop="wxappId" />
      <el-table-column label="商品spu标识" align="center" prop="specSkuId" />
      <el-table-column label="操作" align="center" class-name="small-padding fixed-width">
        <template slot-scope="scope">
          <el-button
            size="mini"
            type="text"
            icon="el-icon-edit"
            @click="handleUpdate(scope.row)"
            v-hasPermi="['system:spec:edit']"
          >修改</el-button>
          <el-button
            size="mini"
            type="text"
            icon="el-icon-delete"
            @click="handleDelete(scope.row)"
            v-hasPermi="['system:spec:remove']"
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
        <el-form-item label="商品id" prop="goodsId">
          <el-input v-model="form.goodsId" placeholder="请输入商品id" />
        </el-form-item>
        <el-form-item label="商品编码" prop="goodsNo">
          <el-input v-model="form.goodsNo" placeholder="请输入商品编码" />
        </el-form-item>
        <el-form-item label="商品价格" prop="goodsPrice">
          <el-input v-model="form.goodsPrice" placeholder="请输入商品价格" />
        </el-form-item>
        <el-form-item label="商品划线价" prop="linePrice">
          <el-input v-model="form.linePrice" placeholder="请输入商品划线价" />
        </el-form-item>
        <el-form-item label="当前库存数量" prop="stockNum">
          <el-input v-model="form.stockNum" placeholder="请输入当前库存数量" />
        </el-form-item>
        <el-form-item label="商品销量" prop="goodsSales">
          <el-input v-model="form.goodsSales" placeholder="请输入商品销量" />
        </el-form-item>
        <el-form-item label="小程序id" prop="wxappId">
          <el-input v-model="form.wxappId" placeholder="请输入小程序id" />
        </el-form-item>
        <el-form-item label="商品spu标识" prop="specSkuId">
          <el-input v-model="form.specSkuId" placeholder="请输入商品spu标识" />
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
import { listSpec, getSpec, delSpec, addSpec, updateSpec } from "@/api/system/spec";

export default {
  name: "Spec",
  components: {
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
      specList: [],
      // 弹出层标题
      title: "",
      // 是否显示弹出层
      open: false,
      // 查询参数
      queryParams: {
        pageNum: 1,
        pageSize: 10,
        goodsId: null,
        goodsNo: null,
        goodsPrice: null,
        linePrice: null,
        stockNum: null,
        goodsSales: null,
        goodsWeight: null,
        wxappId: null,
        specSkuId: null,
      },
      // 表单参数
      form: {},
      // 表单校验
      rules: {
        goodsId: [
          { required: true, message: "商品id不能为空", trigger: "blur" }
        ],
        goodsNo: [
          { required: true, message: "商品编码不能为空", trigger: "blur" }
        ],
        goodsPrice: [
          { required: true, message: "商品价格不能为空", trigger: "blur" }
        ],
        linePrice: [
          { required: true, message: "商品划线价不能为空", trigger: "blur" }
        ],
        stockNum: [
          { required: true, message: "当前库存数量不能为空", trigger: "blur" }
        ],
        goodsSales: [
          { required: true, message: "商品销量不能为空", trigger: "blur" }
        ],
        goodsWeight: [
          { required: true, message: "商品重量(Kg)不能为空", trigger: "blur" }
        ],
        wxappId: [
          { required: true, message: "小程序id不能为空", trigger: "blur" }
        ],
        specSkuId: [
          { required: true, message: "商品spu标识不能为空", trigger: "blur" }
        ],
        createTime: [
          { required: true, message: "创建时间不能为空", trigger: "blur" }
        ],
        updateTime: [
          { required: true, message: "更新时间不能为空", trigger: "blur" }
        ]
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
      listSpec(this.queryParams).then(response => {
        this.specList = response.rows;
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
        goodsSpecId: null,
        goodsId: null,
        goodsNo: null,
        goodsPrice: null,
        linePrice: null,
        stockNum: null,
        goodsSales: null,
        goodsWeight: null,
        wxappId: null,
        specSkuId: null,
        createTime: null,
        updateTime: null
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
      this.ids = selection.map(item => item.goodsSpecId)
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
      const goodsSpecId = row.goodsSpecId || this.ids
      getSpec(goodsSpecId).then(response => {
        this.form = response.data;
        this.open = true;
        this.title = "修改【请填写功能名称】";
      });
    },
    /** 提交按钮 */
    submitForm() {
      this.$refs["form"].validate(valid => {
        if (valid) {
          if (this.form.goodsSpecId != null) {
            updateSpec(this.form).then(response => {
              this.msgSuccess("修改成功");
              this.open = false;
              this.getList();
            });
          } else {
            addSpec(this.form).then(response => {
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
      const goodsSpecIds = row.goodsSpecId || this.ids;
      this.$confirm('是否确认删除【请填写功能名称】编号为"' + goodsSpecIds + '"的数据项?', "警告", {
          confirmButtonText: "确定",
          cancelButtonText: "取消",
          type: "warning"
        }).then(function() {
          return delSpec(goodsSpecIds);
        }).then(() => {
          this.getList();
          this.msgSuccess("删除成功");
        })
    },
    /** 导出按钮操作 */
    handleExport() {
      this.download('system/spec/export', {
        ...this.queryParams
      }, `system_spec.xlsx`)
    }
  }
};
</script>