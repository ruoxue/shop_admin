<template>
  <div class="app-container">
    <el-form :model="queryParams" ref="queryForm" :inline="true" v-show="showSearch" label-width="68px">
      <el-form-item label="订单号" prop="orderNo">
        <el-input
          v-model="queryParams.orderNo"
          placeholder="请输入订单号"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="商品总金额" prop="totalPrice">
        <el-input
          v-model="queryParams.totalPrice"
          placeholder="请输入商品总金额"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="订单实付款金额" prop="payPrice">
        <el-input
          v-model="queryParams.payPrice"
          placeholder="请输入订单实付款金额"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="付款状态(10未付款 20已付款)" prop="payStatus">
        <el-select v-model="queryParams.payStatus" placeholder="请选择付款状态(10未付款 20已付款)" clearable size="small">
          <el-option label="请选择字典生成" value="" />
        </el-select>
      </el-form-item>
      <el-form-item label="付款时间" prop="payTime">
        <el-input
          v-model="queryParams.payTime"
          placeholder="请输入付款时间"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="运费金额" prop="expressPrice">
        <el-input
          v-model="queryParams.expressPrice"
          placeholder="请输入运费金额"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="物流公司" prop="expressCompany">
        <el-input
          v-model="queryParams.expressCompany"
          placeholder="请输入物流公司"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="物流单号" prop="expressNo">
        <el-input
          v-model="queryParams.expressNo"
          placeholder="请输入物流单号"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="发货状态(10未发货 20已发货)" prop="deliveryStatus">
        <el-select v-model="queryParams.deliveryStatus" placeholder="请选择发货状态(10未发货 20已发货)" clearable size="small">
          <el-option label="请选择字典生成" value="" />
        </el-select>
      </el-form-item>
      <el-form-item label="发货时间" prop="deliveryTime">
        <el-input
          v-model="queryParams.deliveryTime"
          placeholder="请输入发货时间"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="收货状态(10未收货 20已收货)" prop="receiptStatus">
        <el-select v-model="queryParams.receiptStatus" placeholder="请选择收货状态(10未收货 20已收货)" clearable size="small">
          <el-option label="请选择字典生成" value="" />
        </el-select>
      </el-form-item>
      <el-form-item label="收货时间" prop="receiptTime">
        <el-input
          v-model="queryParams.receiptTime"
          placeholder="请输入收货时间"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="订单状态(10进行中 20取消 21待取消 30已完成)" prop="orderStatus">
        <el-select v-model="queryParams.orderStatus" placeholder="请选择订单状态(10进行中 20取消 21待取消 30已完成)" clearable size="small">
          <el-option label="请选择字典生成" value="" />
        </el-select>
      </el-form-item>
      <el-form-item label="微信支付交易号" prop="transactionId">
        <el-input
          v-model="queryParams.transactionId"
          placeholder="请输入微信支付交易号"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="用户id" prop="userId">
        <el-input
          v-model="queryParams.userId"
          placeholder="请输入用户id"
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
          v-hasPermi="['system:order:add']"
        >新增</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="success"
          icon="el-icon-edit"
          size="mini"
          :disabled="single"
          @click="handleUpdate"
          v-hasPermi="['system:order:edit']"
        >修改</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="danger"
          icon="el-icon-delete"
          size="mini"
          :disabled="multiple"
          @click="handleDelete"
          v-hasPermi="['system:order:remove']"
        >删除</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="warning"
          icon="el-icon-download"
          size="mini"
          @click="handleExport"
          v-hasPermi="['system:order:export']"
        >导出</el-button>
      </el-col>
	  <right-toolbar :showSearch.sync="showSearch" @queryTable="getList"></right-toolbar>
    </el-row>

    <el-table v-loading="loading" :data="orderList" @selection-change="handleSelectionChange">
      <el-table-column type="selection" width="55" align="center" />
      <el-table-column label="订单id" align="center" prop="orderId" />
      <el-table-column label="订单号" align="center" prop="orderNo" />
      <el-table-column label="商品总金额" align="center" prop="totalPrice" />
      <el-table-column label="订单实付款金额" align="center" prop="payPrice" />
      <el-table-column label="付款状态(10未付款 20已付款)" align="center" prop="payStatus" />
      <el-table-column label="付款时间" align="center" prop="payTime" />
      <el-table-column label="运费金额" align="center" prop="expressPrice" />
      <el-table-column label="物流公司" align="center" prop="expressCompany" />
      <el-table-column label="物流单号" align="center" prop="expressNo" />
      <el-table-column label="发货状态(10未发货 20已发货)" align="center" prop="deliveryStatus" />
      <el-table-column label="发货时间" align="center" prop="deliveryTime" />
      <el-table-column label="收货状态(10未收货 20已收货)" align="center" prop="receiptStatus" />
      <el-table-column label="收货时间" align="center" prop="receiptTime" />
      <el-table-column label="订单状态(10进行中 20取消 21待取消 30已完成)" align="center" prop="orderStatus" />
      <el-table-column label="微信支付交易号" align="center" prop="transactionId" />
      <el-table-column label="用户id" align="center" prop="userId" />
      <el-table-column label="小程序id" align="center" prop="wxappId" />
      <el-table-column label="操作" align="center" class-name="small-padding fixed-width">
        <template slot-scope="scope">
          <el-button
            size="mini"
            type="text"
            icon="el-icon-edit"
            @click="handleUpdate(scope.row)"
            v-hasPermi="['system:order:edit']"
          >修改</el-button>
          <el-button
            size="mini"
            type="text"
            icon="el-icon-delete"
            @click="handleDelete(scope.row)"
            v-hasPermi="['system:order:remove']"
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
        <el-form-item label="订单号" prop="orderNo">
          <el-input v-model="form.orderNo" placeholder="请输入订单号" />
        </el-form-item>
        <el-form-item label="商品总金额" prop="totalPrice">
          <el-input v-model="form.totalPrice" placeholder="请输入商品总金额" />
        </el-form-item>
        <el-form-item label="订单实付款金额" prop="payPrice">
          <el-input v-model="form.payPrice" placeholder="请输入订单实付款金额" />
        </el-form-item>
        <el-form-item label="付款状态(10未付款 20已付款)">
          <el-radio-group v-model="form.payStatus">
            <el-radio label="1">请选择字典生成</el-radio>
          </el-radio-group>
        </el-form-item>
        <el-form-item label="付款时间" prop="payTime">
          <el-input v-model="form.payTime" placeholder="请输入付款时间" />
        </el-form-item>
        <el-form-item label="运费金额" prop="expressPrice">
          <el-input v-model="form.expressPrice" placeholder="请输入运费金额" />
        </el-form-item>
        <el-form-item label="物流公司" prop="expressCompany">
          <el-input v-model="form.expressCompany" placeholder="请输入物流公司" />
        </el-form-item>
        <el-form-item label="物流单号" prop="expressNo">
          <el-input v-model="form.expressNo" placeholder="请输入物流单号" />
        </el-form-item>
        <el-form-item label="发货状态(10未发货 20已发货)">
          <el-radio-group v-model="form.deliveryStatus">
            <el-radio label="1">请选择字典生成</el-radio>
          </el-radio-group>
        </el-form-item>
        <el-form-item label="发货时间" prop="deliveryTime">
          <el-input v-model="form.deliveryTime" placeholder="请输入发货时间" />
        </el-form-item>
        <el-form-item label="收货状态(10未收货 20已收货)">
          <el-radio-group v-model="form.receiptStatus">
            <el-radio label="1">请选择字典生成</el-radio>
          </el-radio-group>
        </el-form-item>
        <el-form-item label="收货时间" prop="receiptTime">
          <el-input v-model="form.receiptTime" placeholder="请输入收货时间" />
        </el-form-item>
        <el-form-item label="订单状态(10进行中 20取消 21待取消 30已完成)">
          <el-radio-group v-model="form.orderStatus">
            <el-radio label="1">请选择字典生成</el-radio>
          </el-radio-group>
        </el-form-item>
        <el-form-item label="微信支付交易号" prop="transactionId">
          <el-input v-model="form.transactionId" placeholder="请输入微信支付交易号" />
        </el-form-item>
        <el-form-item label="用户id" prop="userId">
          <el-input v-model="form.userId" placeholder="请输入用户id" />
        </el-form-item>
        <el-form-item label="小程序id" prop="wxappId">
          <el-input v-model="form.wxappId" placeholder="请输入小程序id" />
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
import { listOrder, getOrder, delOrder, addOrder, updateOrder } from "@/api/system/order";

export default {
  name: "Order",
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
      orderList: [],
      // 弹出层标题
      title: "",
      // 是否显示弹出层
      open: false,
      // 查询参数
      queryParams: {
        pageNum: 1,
        pageSize: 10,
        orderNo: null,
        totalPrice: null,
        payPrice: null,
        payStatus: null,
        payTime: null,
        expressPrice: null,
        expressCompany: null,
        expressNo: null,
        deliveryStatus: null,
        deliveryTime: null,
        receiptStatus: null,
        receiptTime: null,
        orderStatus: null,
        transactionId: null,
        userId: null,
        wxappId: null,
      },
      // 表单参数
      form: {},
      // 表单校验
      rules: {
        orderNo: [
          { required: true, message: "订单号不能为空", trigger: "blur" }
        ],
        totalPrice: [
          { required: true, message: "商品总金额不能为空", trigger: "blur" }
        ],
        payPrice: [
          { required: true, message: "订单实付款金额不能为空", trigger: "blur" }
        ],
        payStatus: [
          { required: true, message: "付款状态(10未付款 20已付款)不能为空", trigger: "blur" }
        ],
        payTime: [
          { required: true, message: "付款时间不能为空", trigger: "blur" }
        ],
        expressPrice: [
          { required: true, message: "运费金额不能为空", trigger: "blur" }
        ],
        expressCompany: [
          { required: true, message: "物流公司不能为空", trigger: "blur" }
        ],
        expressNo: [
          { required: true, message: "物流单号不能为空", trigger: "blur" }
        ],
        deliveryStatus: [
          { required: true, message: "发货状态(10未发货 20已发货)不能为空", trigger: "blur" }
        ],
        deliveryTime: [
          { required: true, message: "发货时间不能为空", trigger: "blur" }
        ],
        receiptStatus: [
          { required: true, message: "收货状态(10未收货 20已收货)不能为空", trigger: "blur" }
        ],
        receiptTime: [
          { required: true, message: "收货时间不能为空", trigger: "blur" }
        ],
        orderStatus: [
          { required: true, message: "订单状态(10进行中 20取消 21待取消 30已完成)不能为空", trigger: "blur" }
        ],
        transactionId: [
          { required: true, message: "微信支付交易号不能为空", trigger: "blur" }
        ],
        userId: [
          { required: true, message: "用户id不能为空", trigger: "blur" }
        ],
        wxappId: [
          { required: true, message: "小程序id不能为空", trigger: "blur" }
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
      listOrder(this.queryParams).then(response => {
        this.orderList = response.rows;
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
        orderId: null,
        orderNo: null,
        totalPrice: null,
        payPrice: null,
        payStatus: 0,
        payTime: null,
        expressPrice: null,
        expressCompany: null,
        expressNo: null,
        deliveryStatus: 0,
        deliveryTime: null,
        receiptStatus: 0,
        receiptTime: null,
        orderStatus: 0,
        transactionId: null,
        userId: null,
        wxappId: null,
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
      this.ids = selection.map(item => item.orderId)
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
      const orderId = row.orderId || this.ids
      getOrder(orderId).then(response => {
        this.form = response.data;
        this.open = true;
        this.title = "修改【请填写功能名称】";
      });
    },
    /** 提交按钮 */
    submitForm() {
      this.$refs["form"].validate(valid => {
        if (valid) {
          if (this.form.orderId != null) {
            updateOrder(this.form).then(response => {
              this.msgSuccess("修改成功");
              this.open = false;
              this.getList();
            });
          } else {
            addOrder(this.form).then(response => {
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
      const orderIds = row.orderId || this.ids;
      this.$confirm('是否确认删除【请填写功能名称】编号为"' + orderIds + '"的数据项?', "警告", {
          confirmButtonText: "确定",
          cancelButtonText: "取消",
          type: "warning"
        }).then(function() {
          return delOrder(orderIds);
        }).then(() => {
          this.getList();
          this.msgSuccess("删除成功");
        })
    },
    /** 导出按钮操作 */
    handleExport() {
      this.download('system/order/export', {
        ...this.queryParams
      }, `system_order.xlsx`)
    }
  }
};
</script>