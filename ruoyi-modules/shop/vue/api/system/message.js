import request from '@/utils/request'

// 查询系统-会员-短信列表
export function listMessage(query) {
  return request({
    url: '/system/message/list',
    method: 'get',
    params: query
  })
}

// 查询系统-会员-短信详细
export function getMessage(id) {
  return request({
    url: '/system/message/' + id,
    method: 'get'
  })
}

// 新增系统-会员-短信
export function addMessage(data) {
  return request({
    url: '/system/message',
    method: 'post',
    data: data
  })
}

// 修改系统-会员-短信
export function updateMessage(data) {
  return request({
    url: '/system/message',
    method: 'put',
    data: data
  })
}

// 删除系统-会员-短信
export function delMessage(id) {
  return request({
    url: '/system/message/' + id,
    method: 'delete'
  })
}
