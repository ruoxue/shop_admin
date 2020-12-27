-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('商城-快递-公司', '3', '1', 'company', 'system/company/index', 1, 0, 'C', '0', '0', 'system:company:list', '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '商城-快递-公司菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('商城-快递-公司查询', @parentId, '1',  '#', '', 1, 0, 'F', '0', '0', 'system:company:query',        '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('商城-快递-公司新增', @parentId, '2',  '#', '', 1, 0, 'F', '0', '0', 'system:company:add',          '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('商城-快递-公司修改', @parentId, '3',  '#', '', 1, 0, 'F', '0', '0', 'system:company:edit',         '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('商城-快递-公司删除', @parentId, '4',  '#', '', 1, 0, 'F', '0', '0', 'system:company:remove',       '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('商城-快递-公司导出', @parentId, '5',  '#', '', 1, 0, 'F', '0', '0', 'system:company:export',       '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');