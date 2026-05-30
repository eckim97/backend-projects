-- 테스트 계정
-- TODO: 테스트용이지만 비밀번호가 노출된 데이터 세팅. 개선하는 것이 좋을 지 고민해 보자.
insert into admin_account (user_id, user_password, role_types, nickname, email, memo, created_at, created_by, modified_at, modified_by) values
    ('eunchan', '{noop}asdf1234', 'ADMIN', 'eunchan', 'eunchan@mail.com', 'I am eunchan.', now(), 'eunchan', now(), 'eunchan'),
    ('mark', '{noop}asdf1234', 'MANAGER', 'Mark', 'mark@mail.com', 'I am Mark.', now(), 'eunchan', now(), 'eunchan'),
    ('susan', '{noop}asdf1234', 'MANAGER,DEVELOPER', 'Susan', 'Susan@mail.com', 'I am Susan.', now(), 'eunchan', now(), 'eunchan'),
    ('jim', '{noop}asdf1234', 'USER', 'Jim', 'jim@mail.com', 'I am Jim.', now(), 'eunchan', now(), 'eunchan')
;