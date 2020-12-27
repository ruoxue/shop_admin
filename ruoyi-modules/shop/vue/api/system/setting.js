import request from '@/utils/request'

// 查询【请填写功能名称】列表
export function listSetting(query) {
  return request({
    url: '/system/setting/list',
    method: 'get',
    params: query
  })
}

// 查询【请填写功能名称】详细
export function getSetting(key) {
  return request({
    url: '/system/setting/' + key,
    method: 'get'
  })
}

// 新增【请填写功能名称】
export function addSetting(data) {
  return request({
    url: '/system/setting',
    method: 'post',
    data: data
  })
}

// 修改【请填写功能名称】
export function updateSetting(data) {
  return request({
    url: '/system/setting',
    method: 'put',
    data: data
  })
}

// 删除【请填写功能名称】
export function delSetting(key) {
  return request({
    url: '/system/setting/' + key,
    method: 'delete'
  })
}
