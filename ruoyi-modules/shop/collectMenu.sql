-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('数据-文章-会员-收藏', '3', '1', 'collect', 'system/collect/index', 1, 0, 'C', '0', '0', 'system:collect:list', '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '数据-文章-会员-收藏菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('数据-文章-会员-收藏查询', @parentId, '1',  '#', '', 1, 0, 'F', '0', '0', 'system:collect:query',        '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('数据-文章-会员-收藏新增', @parentId, '2',  '#', '', 1, 0, 'F', '0', '0', 'system:collect:add',          '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('数据-文章-会员-收藏修改', @parentId, '3',  '#', '', 1, 0, 'F', '0', '0', 'system:collect:edit',         '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('数据-文章-会员-收藏删除', @parentId, '4',  '#', '', 1, 0, 'F', '0', '0', 'system:collect:remove',       '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('数据-文章-会员-收藏导出', @parentId, '5',  '#', '', 1, 0, 'F', '0', '0', 'system:collect:export',       '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');