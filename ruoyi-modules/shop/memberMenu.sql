-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('数据-会员', '3', '1', 'member', 'system/member/index', 1, 0, 'C', '0', '0', 'system:member:list', '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '数据-会员菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('数据-会员查询', @parentId, '1',  '#', '', 1, 0, 'F', '0', '0', 'system:member:query',        '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('数据-会员新增', @parentId, '2',  '#', '', 1, 0, 'F', '0', '0', 'system:member:add',          '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('数据-会员修改', @parentId, '3',  '#', '', 1, 0, 'F', '0', '0', 'system:member:edit',         '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('数据-会员删除', @parentId, '4',  '#', '', 1, 0, 'F', '0', '0', 'system:member:remove',       '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('数据-会员导出', @parentId, '5',  '#', '', 1, 0, 'F', '0', '0', 'system:member:export',       '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');