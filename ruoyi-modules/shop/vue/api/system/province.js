import request from '@/utils/request'

// 查询商城-快递-省份列表
export function listProvince(query) {
  return request({
    url: '/system/province/list',
    method: 'get',
    params: query
  })
}

// 查询商城-快递-省份详细
export function getProvince(id) {
  return request({
    url: '/system/province/' + id,
    method: 'get'
  })
}

// 新增商城-快递-省份
export function addProvince(data) {
  return request({
    url: '/system/province',
    method: 'post',
    data: data
  })
}

// 修改商城-快递-省份
export function updateProvince(data) {
  return request({
    url: '/system/province',
    method: 'put',
    data: data
  })
}

// 删除商城-快递-省份
export function delProvince(id) {
  return request({
    url: '/system/province/' + id,
    method: 'delete'
  })
}
