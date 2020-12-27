import request from '@/utils/request'

// 查询数据-文章-会员-收藏列表
export function listCollect(query) {
  return request({
    url: '/system/collect/list',
    method: 'get',
    params: query
  })
}

// 查询数据-文章-会员-收藏详细
export function getCollect(id) {
  return request({
    url: '/system/collect/' + id,
    method: 'get'
  })
}

// 新增数据-文章-会员-收藏
export function addCollect(data) {
  return request({
    url: '/system/collect',
    method: 'post',
    data: data
  })
}

// 修改数据-文章-会员-收藏
export function updateCollect(data) {
  return request({
    url: '/system/collect',
    method: 'put',
    data: data
  })
}

// 删除数据-文章-会员-收藏
export function delCollect(id) {
  return request({
    url: '/system/collect/' + id,
    method: 'delete'
  })
}
