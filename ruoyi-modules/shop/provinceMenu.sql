-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('商城-快递-省份', '3', '1', 'province', 'system/province/index', 1, 0, 'C', '0', '0', 'system:province:list', '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '商城-快递-省份菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('商城-快递-省份查询', @parentId, '1',  '#', '', 1, 0, 'F', '0', '0', 'system:province:query',        '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('商城-快递-省份新增', @parentId, '2',  '#', '', 1, 0, 'F', '0', '0', 'system:province:add',          '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('商城-快递-省份修改', @parentId, '3',  '#', '', 1, 0, 'F', '0', '0', 'system:province:edit',         '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('商城-快递-省份删除', @parentId, '4',  '#', '', 1, 0, 'F', '0', '0', 'system:province:remove',       '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('商城-快递-省份导出', @parentId, '5',  '#', '', 1, 0, 'F', '0', '0', 'system:province:export',       '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');