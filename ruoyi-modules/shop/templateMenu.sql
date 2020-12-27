-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('商城-快递-费用', '3', '1', 'template', 'system/template/index', 1, 0, 'C', '0', '0', 'system:template:list', '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '商城-快递-费用菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('商城-快递-费用查询', @parentId, '1',  '#', '', 1, 0, 'F', '0', '0', 'system:template:query',        '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('商城-快递-费用新增', @parentId, '2',  '#', '', 1, 0, 'F', '0', '0', 'system:template:add',          '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('商城-快递-费用修改', @parentId, '3',  '#', '', 1, 0, 'F', '0', '0', 'system:template:edit',         '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('商城-快递-费用删除', @parentId, '4',  '#', '', 1, 0, 'F', '0', '0', 'system:template:remove',       '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('商城-快递-费用导出', @parentId, '5',  '#', '', 1, 0, 'F', '0', '0', 'system:template:export',       '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');