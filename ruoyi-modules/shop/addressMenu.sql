-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('数据-会员-地址', '3', '1', 'address', 'system/address/index', 1, 0, 'C', '0', '0', 'system:address:list', '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '数据-会员-地址菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('数据-会员-地址查询', @parentId, '1',  '#', '', 1, 0, 'F', '0', '0', 'system:address:query',        '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('数据-会员-地址新增', @parentId, '2',  '#', '', 1, 0, 'F', '0', '0', 'system:address:add',          '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('数据-会员-地址修改', @parentId, '3',  '#', '', 1, 0, 'F', '0', '0', 'system:address:edit',         '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('数据-会员-地址删除', @parentId, '4',  '#', '', 1, 0, 'F', '0', '0', 'system:address:remove',       '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('数据-会员-地址导出', @parentId, '5',  '#', '', 1, 0, 'F', '0', '0', 'system:address:export',       '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');