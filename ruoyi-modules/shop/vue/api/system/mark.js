import request from '@/utils/request'

// 查询数据-文章-标签列表
export function listMark(query) {
  return request({
    url: '/system/mark/list',
    method: 'get',
    params: query
  })
}

// 查询数据-文章-标签详细
export function getMark(id) {
  return request({
    url: '/system/mark/' + id,
    method: 'get'
  })
}

// 新增数据-文章-标签
export function addMark(data) {
  return request({
    url: '/system/mark',
    method: 'post',
    data: data
  })
}

// 修改数据-文章-标签
export function updateMark(data) {
  return request({
    url: '/system/mark',
    method: 'put',
    data: data
  })
}

// 删除数据-文章-标签
export function delMark(id) {
  return request({
    url: '/system/mark/' + id,
    method: 'delete'
  })
}
