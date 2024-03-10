INSERT INTO netology_task.customers (name, surname, age, phone_number)
VALUES ('alexey', 'Pupkin', 25, 79272502258),
       ('Alexey', 'Lukin', 28, 79272502343),
       ('ALEXEY', 'Ozerov', 30, NULL),
       ('Sergey', 'Shanin', 25, 79272555555),
       ('Oleg', 'Guiko', 55, 79277777777),
       ('alexey', 'Minin', 34, 79278888888),
       ('Kolia', 'Pupkin', 17, NULL),
       ('Sergey', 'Klik', 43, 79275577755),
       ('Vasia', 'Aivasyan', 33, 79274665688),
       ('Nina', 'Rugko', 34, 7927256565675),
       ('Masha', 'Erykina', 67, 792756565658);

INSERT INTO netology_task.orders (date, customer_id, product_name, amount)
values	('2024-02-03', 1, 'product_A', 54654),
          ('2024-02-03', 3, 'product_B', 123),
          ('2024-02-03', 1, 'product_C', 234),
          ('2024-02-03', 2, 'product_D', 343),
          ('2024-02-03', 4, 'product_F', 5),
          ('2024-02-03', 5, 'product_A', 435),
          ('2024-02-03', 6, 'product_W', 34),
          ('2024-02-03', 7, 'product_R', 546),
          ('2024-02-03', 8, 'product_T', 544),
          ('2024-02-03', 9, 'product_Y', 33);