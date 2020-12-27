-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('数据-会员-金币-获得', '3', '1', 'item', 'system/item/index', 1, 0, 'C', '0', '0', 'system:item:list', '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '数据-会员-金币-获得菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('数据-会员-金币-获得查询', @parentId, '1',  '#', '', 1, 0, 'F', '0', '0', 'system:item:query',        '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('数据-会员-金币-获得新增', @parentId, '2',  '#', '', 1, 0, 'F', '0', '0', 'system:item:add',          '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('数据-会员-金币-获得修改', @parentId, '3',  '#', '', 1, 0, 'F', '0', '0', 'system:item:edit',         '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('数据-会员-金币-获得删除', @parentId, '4',  '#', '', 1, 0, 'F', '0', '0', 'system:item:remove',       '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('数据-会员-金币-获得导出', @parentId, '5',  '#', '', 1, 0, 'F', '0', '0', 'system:item:export',       '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');