import request from '@/utils/request'

// 查询【请填写功能名称】列表
export function listSpec(query) {
  return request({
    url: '/system/spec/list',
    method: 'get',
    params: query
  })
}

// 查询【请填写功能名称】详细
export function getSpec(goodsSpecId) {
  return request({
    url: '/system/spec/' + goodsSpecId,
    method: 'get'
  })
}

// 新增【请填写功能名称】
export function addSpec(data) {
  return request({
    url: '/system/spec',
    method: 'post',
    data: data
  })
}

// 修改【请填写功能名称】
export function updateSpec(data) {
  return request({
    url: '/system/spec',
    method: 'put',
    data: data
  })
}

// 删除【请填写功能名称】
export function delSpec(goodsSpecId) {
  return request({
    url: '/system/spec/' + goodsSpecId,
    method: 'delete'
  })
}
