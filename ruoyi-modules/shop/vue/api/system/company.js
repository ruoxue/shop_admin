import request from '@/utils/request'

// 查询商城-快递-公司列表
export function listCompany(query) {
  return request({
    url: '/system/company/list',
    method: 'get',
    params: query
  })
}

// 查询商城-快递-公司详细
export function getCompany(id) {
  return request({
    url: '/system/company/' + id,
    method: 'get'
  })
}

// 新增商城-快递-公司
export function addCompany(data) {
  return request({
    url: '/system/company',
    method: 'post',
    data: data
  })
}

// 修改商城-快递-公司
export function updateCompany(data) {
  return request({
    url: '/system/company',
    method: 'put',
    data: data
  })
}

// 删除商城-快递-公司
export function delCompany(id) {
  return request({
    url: '/system/company/' + id,
    method: 'delete'
  })
}
