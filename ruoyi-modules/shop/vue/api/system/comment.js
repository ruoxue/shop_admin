import request from '@/utils/request'

// 查询数据-文章-会员-评论列表
export function listComment(query) {
  return request({
    url: '/system/comment/list',
    method: 'get',
    params: query
  })
}

// 查询数据-文章-会员-评论详细
export function getComment(id) {
  return request({
    url: '/system/comment/' + id,
    method: 'get'
  })
}

// 新增数据-文章-会员-评论
export function addComment(data) {
  return request({
    url: '/system/comment',
    method: 'post',
    data: data
  })
}

// 修改数据-文章-会员-评论
export function updateComment(data) {
  return request({
    url: '/system/comment',
    method: 'put',
    data: data
  })
}

// 删除数据-文章-会员-评论
export function delComment(id) {
  return request({
    url: '/system/comment/' + id,
    method: 'delete'
  })
}