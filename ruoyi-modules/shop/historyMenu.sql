-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('数据-文章-会员-历史', '3', '1', 'history', 'system/history/index', 1, 0, 'C', '0', '0', 'system:history:list', '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '数据-文章-会员-历史菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('数据-文章-会员-历史查询', @parentId, '1',  '#', '', 1, 0, 'F', '0', '0', 'system:history:query',        '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('数据-文章-会员-历史新增', @parentId, '2',  '#', '', 1, 0, 'F', '0', '0', 'system:history:add',          '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('数据-文章-会员-历史修改', @parentId, '3',  '#', '', 1, 0, 'F', '0', '0', 'system:history:edit',         '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('数据-文章-会员-历史删除', @parentId, '4',  '#', '', 1, 0, 'F', '0', '0', 'system:history:remove',       '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('数据-文章-会员-历史导出', @parentId, '5',  '#', '', 1, 0, 'F', '0', '0', 'system:history:export',       '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');