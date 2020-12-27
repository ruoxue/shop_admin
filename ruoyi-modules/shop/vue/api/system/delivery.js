import request from '@/utils/request'

// 查询【请填写功能名称】列表
export function listDelivery(query) {
  return request({
    url: '/system/delivery/list',
    method: 'get',
    params: query
  })
}

// 查询【请填写功能名称】详细
export function getDelivery(deliveryId) {
  return request({
    url: '/system/delivery/' + deliveryId,
    method: 'get'
  })
}

// 新增【请填写功能名称】
export function addDelivery(data) {
  return request({
    url: '/system/delivery',
    method: 'post',
    data: data
  })
}

// 修改【请填写功能名称】
export function updateDelivery(data) {
  return request({
    url: '/system/delivery',
    method: 'put',
    data: data
  })
}

// 删除【请填写功能名称】
export function delDelivery(deliveryId) {
  return request({
    url: '/system/delivery/' + deliveryId,
    method: 'delete'
  })
}
