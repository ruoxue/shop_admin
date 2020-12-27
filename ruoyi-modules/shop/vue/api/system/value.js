import request from '@/utils/request'

// 查询【请填写功能名称】列表
export function listValue(query) {
  return request({
    url: '/system/value/list',
    method: 'get',
    params: query
  })
}

// 查询【请填写功能名称】详细
export function getValue(specValueId) {
  return request({
    url: '/system/value/' + specValueId,
    method: 'get'
  })
}

// 新增【请填写功能名称】
export function addValue(data) {
  return request({
    url: '/system/value',
    method: 'post',
    data: data
  })
}

// 修改【请填写功能名称】
export function updateValue(data) {
  return request({
    url: '/system/value',
    method: 'put',
    data: data
  })
}

// 删除【请填写功能名称】
export function delValue(specValueId) {
  return request({
    url: '/system/value/' + specValueId,
    method: 'delete'
  })
}
