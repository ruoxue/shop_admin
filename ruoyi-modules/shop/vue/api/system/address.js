import request from '@/utils/request'

// 查询数据-会员-地址列表
export function listAddress(query) {
  return request({
    url: '/system/address/list',
    method: 'get',
    params: query
  })
}

// 查询数据-会员-地址详细
export function getAddress(id) {
  return request({
    url: '/system/address/' + id,
    method: 'get'
  })
}

// 新增数据-会员-地址
export function addAddress(data) {
  return request({
    url: '/system/address',
    method: 'post',
    data: data
  })
}

// 修改数据-会员-地址
export function updateAddress(data) {
  return request({
    url: '/system/address',
    method: 'put',
    data: data
  })
}

// 删除数据-会员-地址
export function delAddress(id) {
  return request({
    url: '/system/address/' + id,
    method: 'delete'
  })
}
