-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('数据-文章-标签', '3', '1', 'mark', 'system/mark/index', 1, 0, 'C', '0', '0', 'system:mark:list', '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '数据-文章-标签菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('数据-文章-标签查询', @parentId, '1',  '#', '', 1, 0, 'F', '0', '0', 'system:mark:query',        '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('数据-文章-标签新增', @parentId, '2',  '#', '', 1, 0, 'F', '0', '0', 'system:mark:add',          '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('数据-文章-标签修改', @parentId, '3',  '#', '', 1, 0, 'F', '0', '0', 'system:mark:edit',         '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('数据-文章-标签删除', @parentId, '4',  '#', '', 1, 0, 'F', '0', '0', 'system:mark:remove',       '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('数据-文章-标签导出', @parentId, '5',  '#', '', 1, 0, 'F', '0', '0', 'system:mark:export',       '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');