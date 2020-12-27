-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('数据-会员-金币-消费', '3', '1', 'used', 'system/used/index', 1, 0, 'C', '0', '0', 'system:used:list', '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '数据-会员-金币-消费菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('数据-会员-金币-消费查询', @parentId, '1',  '#', '', 1, 0, 'F', '0', '0', 'system:used:query',        '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('数据-会员-金币-消费新增', @parentId, '2',  '#', '', 1, 0, 'F', '0', '0', 'system:used:add',          '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('数据-会员-金币-消费修改', @parentId, '3',  '#', '', 1, 0, 'F', '0', '0', 'system:used:edit',         '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('数据-会员-金币-消费删除', @parentId, '4',  '#', '', 1, 0, 'F', '0', '0', 'system:used:remove',       '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('数据-会员-金币-消费导出', @parentId, '5',  '#', '', 1, 0, 'F', '0', '0', 'system:used:export',       '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');