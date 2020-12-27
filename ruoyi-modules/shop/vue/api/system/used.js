import request from '@/utils/request'

// 查询数据-会员-金币-消费列表
export function listUsed(query) {
  return request({
    url: '/system/used/list',
    method: 'get',
    params: query
  })
}

// 查询数据-会员-金币-消费详细
export function getUsed(id) {
  return request({
    url: '/system/used/' + id,
    method: 'get'
  })
}

// 新增数据-会员-金币-消费
export function addUsed(data) {
  return request({
    url: '/system/used',
    method: 'post',
    data: data
  })
}

// 修改数据-会员-金币-消费
export function updateUsed(data) {
  return request({
    url: '/system/used',
    method: 'put',
    data: data
  })
}

// 删除数据-会员-金币-消费
export function delUsed(id) {
  return request({
    url: '/system/used/' + id,
    method: 'delete'
  })
}
