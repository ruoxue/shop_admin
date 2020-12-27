import request from '@/utils/request'

// 查询数据-会员-金币-获得列表
export function listItem(query) {
  return request({
    url: '/system/item/list',
    method: 'get',
    params: query
  })
}

// 查询数据-会员-金币-获得详细
export function getItem(id) {
  return request({
    url: '/system/item/' + id,
    method: 'get'
  })
}

// 新增数据-会员-金币-获得
export function addItem(data) {
  return request({
    url: '/system/item',
    method: 'post',
    data: data
  })
}

// 修改数据-会员-金币-获得
export function updateItem(data) {
  return request({
    url: '/system/item',
    method: 'put',
    data: data
  })
}

// 删除数据-会员-金币-获得
export function delItem(id) {
  return request({
    url: '/system/item/' + id,
    method: 'delete'
  })
}
