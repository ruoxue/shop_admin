-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('【请填写功能名称】', '3', '1', 'category', 'system/category/index', 1, 0, 'C', '0', '0', 'system:category:list', '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '【请填写功能名称】菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('【请填写功能名称】查询', @parentId, '1',  '#', '', 1, 0, 'F', '0', '0', 'system:category:query',        '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('【请填写功能名称】新增', @parentId, '2',  '#', '', 1, 0, 'F', '0', '0', 'system:category:add',          '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('【请填写功能名称】修改', @parentId, '3',  '#', '', 1, 0, 'F', '0', '0', 'system:category:edit',         '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('【请填写功能名称】删除', @parentId, '4',  '#', '', 1, 0, 'F', '0', '0', 'system:category:remove',       '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('【请填写功能名称】导出', @parentId, '5',  '#', '', 1, 0, 'F', '0', '0', 'system:category:export',       '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');