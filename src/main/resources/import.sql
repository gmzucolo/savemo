INSERT INTO tb_user (user_email, user_name, user_password, user_phone) VALUES ('gustavo@teste.com.br', 'gustavo', 'teste123', '123');
INSERT INTO tb_user (user_email, user_name, user_password, user_phone) VALUES ('adriano@teste.com.br', 'adriano', 'teste123', '123');

INSERT INTO tb_published_advertisement (ad_published_id, advertisement_description, advertisement_title, advertisement_value, user_id) VALUES(1, 'testedescricao1', 'testetitulo1', 100, 1);
INSERT INTO tb_published_advertisement (ad_published_id, advertisement_description, advertisement_title, advertisement_value, user_id) VALUES(2, 'testedescricao2', 'testetitulo2', 200, 2);

INSERT INTO tb_hired_advertisement (hired_date, ad_published_id, user_id) VALUES ('2019-01-01', 1, 1);
INSERT INTO tb_hired_advertisement (hired_date, ad_published_id, user_id) VALUES ('2019-01-01', 2, 2);

