<template>
  <div class="app-container">
    <el-form :model="queryParams" ref="queryForm" :inline="true" v-show="showSearch" label-width="68px">
      <el-form-item label="邀请者MID" prop="from">
        <el-input
          v-model="queryParams.from"
          placeholder="请输入邀请者MID"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="授权TOKEN令牌" prop="token">
        <el-input
          v-model="queryParams.token"
          placeholder="请输入授权TOKEN令牌"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="授权TOKEN验证" prop="tokenv">
        <el-input
          v-model="queryParams.tokenv"
          placeholder="请输入授权TOKEN验证"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="小程序OPENID" prop="openid1">
        <el-input
          v-model="queryParams.openid1"
          placeholder="请输入小程序OPENID"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="服务号OPENID" prop="openid2">
        <el-input
          v-model="queryParams.openid2"
          placeholder="请输入服务号OPENID"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="公众号UnionID" prop="unionid">
        <el-input
          v-model="queryParams.unionid"
          placeholder="请输入公众号UnionID"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="会员手机" prop="phone">
        <el-input
          v-model="queryParams.phone"
          placeholder="请输入会员手机"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="会员姓名" prop="username">
        <el-input
          v-model="queryParams.username"
          placeholder="请输入会员姓名"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="会员昵称" prop="nickname">
        <el-input
          v-model="queryParams.nickname"
          placeholder="请输入会员昵称"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="登录密码" prop="password">
        <el-input
          v-model="queryParams.password"
          placeholder="请输入登录密码"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="所在省份" prop="regionProvince">
        <el-input
          v-model="queryParams.regionProvince"
          placeholder="请输入所在省份"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="所在城市" prop="regionCity">
        <el-input
          v-model="queryParams.regionCity"
          placeholder="请输入所在城市"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="所在区域" prop="regionArea">
        <el-input
          v-model="queryParams.regionArea"
          placeholder="请输入所在区域"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="会员年龄" prop="baseAge">
        <el-input
          v-model="queryParams.baseAge"
          placeholder="请输入会员年龄"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="会员性别" prop="baseSex">
        <el-select v-model="queryParams.baseSex" placeholder="请选择会员性别" clearable size="small">
          <el-option label="请选择字典生成" value="" />
        </el-select>
      </el-form-item>
      <el-form-item label="会员身高" prop="baseHeight">
        <el-input
          v-model="queryParams.baseHeight"
          placeholder="请输入会员身高"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="会员体重" prop="baseWeight">
        <el-input
          v-model="queryParams.baseWeight"
          placeholder="请输入会员体重"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="会员生日" prop="baseBirthday">
        <el-input
          v-model="queryParams.baseBirthday"
          placeholder="请输入会员生日"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="金币数量" prop="coinTotal">
        <el-input
          v-model="queryParams.coinTotal"
          placeholder="请输入金币数量"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="金币已用" prop="coinUsed">
        <el-input
          v-model="queryParams.coinUsed"
          placeholder="请输入金币已用"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="会员状态(1正常,0已拉黑)" prop="status">
        <el-select v-model="queryParams.status" placeholder="请选择会员状态(1正常,0已拉黑)" clearable size="small">
          <el-option label="请选择字典生成" value="" />
        </el-select>
      </el-form-item>
      <el-form-item label="删除状态" prop="deleted">
        <el-input
          v-model="queryParams.deleted"
          placeholder="请输入删除状态"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="注册时间" prop="createAt">
        <el-date-picker clearable size="small" style="width: 200px"
          v-model="queryParams.createAt"
          type="date"
          value-format="yyyy-MM-dd"
          placeholder="选择注册时间">
        </el-date-picker>
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
          v-hasPermi="['system:member:add']"
        >新增</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="success"
          icon="el-icon-edit"
          size="mini"
          :disabled="single"
          @click="handleUpdate"
          v-hasPermi="['system:member:edit']"
        >修改</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="danger"
          icon="el-icon-delete"
          size="mini"
          :disabled="multiple"
          @click="handleDelete"
          v-hasPermi="['system:member:remove']"
        >删除</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="warning"
          icon="el-icon-download"
          size="mini"
          @click="handleExport"
          v-hasPermi="['system:member:export']"
        >导出</el-button>
      </el-col>
	  <right-toolbar :showSearch.sync="showSearch" @queryTable="getList"></right-toolbar>
    </el-row>

    <el-table v-loading="loading" :data="memberList" @selection-change="handleSelectionChange">
      <el-table-column type="selection" width="55" align="center" />
      <el-table-column label="注册时间" align="center" prop="id" />
      <el-table-column label="邀请者MID" align="center" prop="from" />
      <el-table-column label="授权TOKEN令牌" align="center" prop="token" />
      <el-table-column label="授权TOKEN验证" align="center" prop="tokenv" />
      <el-table-column label="小程序OPENID" align="center" prop="openid1" />
      <el-table-column label="服务号OPENID" align="center" prop="openid2" />
      <el-table-column label="公众号UnionID" align="center" prop="unionid" />
      <el-table-column label="会员手机" align="center" prop="phone" />
      <el-table-column label="会员头像" align="center" prop="headimg" />
      <el-table-column label="会员姓名" align="center" prop="username" />
      <el-table-column label="会员昵称" align="center" prop="nickname" />
      <el-table-column label="登录密码" align="center" prop="password" />
      <el-table-column label="所在省份" align="center" prop="regionProvince" />
      <el-table-column label="所在城市" align="center" prop="regionCity" />
      <el-table-column label="所在区域" align="center" prop="regionArea" />
      <el-table-column label="会员年龄" align="center" prop="baseAge" />
      <el-table-column label="会员性别" align="center" prop="baseSex" />
      <el-table-column label="会员身高" align="center" prop="baseHeight" />
      <el-table-column label="会员体重" align="center" prop="baseWeight" />
      <el-table-column label="会员生日" align="center" prop="baseBirthday" />
      <el-table-column label="金币数量" align="center" prop="coinTotal" />
      <el-table-column label="金币已用" align="center" prop="coinUsed" />
      <el-table-column label="会员状态(1正常,0已拉黑)" align="center" prop="status" />
      <el-table-column label="删除状态" align="center" prop="deleted" />
      <el-table-column label="注册时间" align="center" prop="createAt" width="180">
        <template slot-scope="scope">
          <span>{{ parseTime(scope.row.createAt, '{y}-{m}-{d}') }}</span>
        </template>
      </el-table-column>
      <el-table-column label="操作" align="center" class-name="small-padding fixed-width">
        <template slot-scope="scope">
          <el-button
            size="mini"
            type="text"
            icon="el-icon-edit"
            @click="handleUpdate(scope.row)"
            v-hasPermi="['system:member:edit']"
          >修改</el-button>
          <el-button
            size="mini"
            type="text"
            icon="el-icon-delete"
            @click="handleDelete(scope.row)"
            v-hasPermi="['system:member:remove']"
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

    <!-- 添加或修改数据-会员对话框 -->
    <el-dialog :title="title" :visible.sync="open" width="500px" append-to-body>
      <el-form ref="form" :model="form" :rules="rules" label-width="80px">
        <el-form-item label="邀请者MID" prop="from">
          <el-input v-model="form.from" placeholder="请输入邀请者MID" />
        </el-form-item>
        <el-form-item label="授权TOKEN令牌" prop="token">
          <el-input v-model="form.token" placeholder="请输入授权TOKEN令牌" />
        </el-form-item>
        <el-form-item label="授权TOKEN验证" prop="tokenv">
          <el-input v-model="form.tokenv" placeholder="请输入授权TOKEN验证" />
        </el-form-item>
        <el-form-item label="小程序OPENID" prop="openid1">
          <el-input v-model="form.openid1" placeholder="请输入小程序OPENID" />
        </el-form-item>
        <el-form-item label="服务号OPENID" prop="openid2">
          <el-input v-model="form.openid2" placeholder="请输入服务号OPENID" />
        </el-form-item>
        <el-form-item label="公众号UnionID" prop="unionid">
          <el-input v-model="form.unionid" placeholder="请输入公众号UnionID" />
        </el-form-item>
        <el-form-item label="会员手机" prop="phone">
          <el-input v-model="form.phone" placeholder="请输入会员手机" />
        </el-form-item>
        <el-form-item label="会员头像" prop="headimg">
          <el-input v-model="form.headimg" type="textarea" placeholder="请输入内容" />
        </el-form-item>
        <el-form-item label="会员姓名" prop="username">
          <el-input v-model="form.username" placeholder="请输入会员姓名" />
        </el-form-item>
        <el-form-item label="会员昵称" prop="nickname">
          <el-input v-model="form.nickname" placeholder="请输入会员昵称" />
        </el-form-item>
        <el-form-item label="登录密码" prop="password">
          <el-input v-model="form.password" placeholder="请输入登录密码" />
        </el-form-item>
        <el-form-item label="所在省份" prop="regionProvince">
          <el-input v-model="form.regionProvince" placeholder="请输入所在省份" />
        </el-form-item>
        <el-form-item label="所在城市" prop="regionCity">
          <el-input v-model="form.regionCity" placeholder="请输入所在城市" />
        </el-form-item>
        <el-form-item label="所在区域" prop="regionArea">
          <el-input v-model="form.regionArea" placeholder="请输入所在区域" />
        </el-form-item>
        <el-form-item label="会员年龄" prop="baseAge">
          <el-input v-model="form.baseAge" placeholder="请输入会员年龄" />
        </el-form-item>
        <el-form-item label="会员性别" prop="baseSex">
          <el-select v-model="form.baseSex" placeholder="请选择会员性别">
            <el-option label="请选择字典生成" value="" />
          </el-select>
        </el-form-item>
        <el-form-item label="会员身高" prop="baseHeight">
          <el-input v-model="form.baseHeight" placeholder="请输入会员身高" />
        </el-form-item>
        <el-form-item label="会员体重" prop="baseWeight">
          <el-input v-model="form.baseWeight" placeholder="请输入会员体重" />
        </el-form-item>
        <el-form-item label="会员生日" prop="baseBirthday">
          <el-input v-model="form.baseBirthday" placeholder="请输入会员生日" />
        </el-form-item>
        <el-form-item label="金币数量" prop="coinTotal">
          <el-input v-model="form.coinTotal" placeholder="请输入金币数量" />
        </el-form-item>
        <el-form-item label="金币已用" prop="coinUsed">
          <el-input v-model="form.coinUsed" placeholder="请输入金币已用" />
        </el-form-item>
        <el-form-item label="会员状态(1正常,0已拉黑)">
          <el-radio-group v-model="form.status">
            <el-radio label="1">请选择字典生成</el-radio>
          </el-radio-group>
        </el-form-item>
        <el-form-item label="删除状态" prop="deleted">
          <el-input v-model="form.deleted" placeholder="请输入删除状态" />
        </el-form-item>
        <el-form-item label="注册时间" prop="createAt">
          <el-date-picker clearable size="small" style="width: 200px"
            v-model="form.createAt"
            type="date"
            value-format="yyyy-MM-dd"
            placeholder="选择注册时间">
          </el-date-picker>
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
import { listMember, getMember, delMember, addMember, updateMember } from "@/api/system/member";

export default {
  name: "Member",
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
      // 数据-会员表格数据
      memberList: [],
      // 弹出层标题
      title: "",
      // 是否显示弹出层
      open: false,
      // 查询参数
      queryParams: {
        pageNum: 1,
        pageSize: 10,
        from: null,
        token: null,
        tokenv: null,
        openid1: null,
        openid2: null,
        unionid: null,
        phone: null,
        headimg: null,
        username: null,
        nickname: null,
        password: null,
        regionProvince: null,
        regionCity: null,
        regionArea: null,
        baseAge: null,
        baseSex: null,
        baseHeight: null,
        baseWeight: null,
        baseBirthday: null,
        coinTotal: null,
        coinUsed: null,
        status: null,
        deleted: null,
        createAt: null
      },
      // 表单参数
      form: {},
      // 表单校验
      rules: {
      }
    };
  },
  created() {
    this.getList();
  },
  methods: {
    /** 查询数据-会员列表 */
    getList() {
      this.loading = true;
      listMember(this.queryParams).then(response => {
        this.memberList = response.rows;
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
        id: null,
        from: null,
        token: null,
        tokenv: null,
        openid1: null,
        openid2: null,
        unionid: null,
        phone: null,
        headimg: null,
        username: null,
        nickname: null,
        password: null,
        regionProvince: null,
        regionCity: null,
        regionArea: null,
        baseAge: null,
        baseSex: null,
        baseHeight: null,
        baseWeight: null,
        baseBirthday: null,
        coinTotal: null,
        coinUsed: null,
        status: 0,
        deleted: null,
        createAt: null
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
      this.ids = selection.map(item => item.id)
      this.single = selection.length!==1
      this.multiple = !selection.length
    },
    /** 新增按钮操作 */
    handleAdd() {
      this.reset();
      this.open = true;
      this.title = "添加数据-会员";
    },
    /** 修改按钮操作 */
    handleUpdate(row) {
      this.reset();
      const id = row.id || this.ids
      getMember(id).then(response => {
        this.form = response.data;
        this.open = true;
        this.title = "修改数据-会员";
      });
    },
    /** 提交按钮 */
    submitForm() {
      this.$refs["form"].validate(valid => {
        if (valid) {
          if (this.form.id != null) {
            updateMember(this.form).then(response => {
              this.msgSuccess("修改成功");
              this.open = false;
              this.getList();
            });
          } else {
            addMember(this.form).then(response => {
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
      const ids = row.id || this.ids;
      this.$confirm('是否确认删除数据-会员编号为"' + ids + '"的数据项?', "警告", {
          confirmButtonText: "确定",
          cancelButtonText: "取消",
          type: "warning"
        }).then(function() {
          return delMember(ids);
        }).then(() => {
          this.getList();
          this.msgSuccess("删除成功");
        })
    },
    /** 导出按钮操作 */
    handleExport() {
      this.download('system/member/export', {
        ...this.queryParams
      }, `system_member.xlsx`)
    }
  }
};
</script>