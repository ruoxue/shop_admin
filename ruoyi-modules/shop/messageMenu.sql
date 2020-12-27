-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('系统-会员-短信', '3', '1', 'message', 'system/message/index', 1, 0, 'C', '0', '0', 'system:message:list', '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '系统-会员-短信菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('系统-会员-短信查询', @parentId, '1',  '#', '', 1, 0, 'F', '0', '0', 'system:message:query',        '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('系统-会员-短信新增', @parentId, '2',  '#', '', 1, 0, 'F', '0', '0', 'system:message:add',          '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('系统-会员-短信修改', @parentId, '3',  '#', '', 1, 0, 'F', '0', '0', 'system:message:edit',         '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('系统-会员-短信删除', @parentId, '4',  '#', '', 1, 0, 'F', '0', '0', 'system:message:remove',       '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('系统-会员-短信导出', @parentId, '5',  '#', '', 1, 0, 'F', '0', '0', 'system:message:export',       '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');