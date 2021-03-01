DROP TABLE IF EXISTS food;

CREATE TABLE food (
    id SERIAL PRIMARY KEY,
    brand VARCHAR(20),
    food_type VARCHAR(20),
    name VARCHAR(20),
    good_until DATE,
    quantity_on_stock INT,
    animal_type VARCHAR(20)
);
DROP TABLE IF EXISTS cat_food;

CREATE TABLE cat_food (
    id SERIAL PRIMARY KEY,
    brand VARCHAR(20),
    food_type VARCHAR(20),
    name VARCHAR(20),
    good_until DATE,
    quantity_on_stock INT
);

DROP TABLE IF EXISTS dog_food;

CREATE TABLE dog_food (
    id SERIAL PRIMARY KEY,
    brand VARCHAR(20),
    food_type VARCHAR(20),
    name VARCHAR(20),
    good_until DATE,
    quantity_on_stock INT
);

DROP TABLE IF EXISTS fish_food;

CREATE TABLE fish_food (
    id SERIAL PRIMARY KEY,
    brand VARCHAR(20),
    food_type VARCHAR(20),
    name VARCHAR(20),
    good_until DATE,
    quantity_on_stock INT
);

INSERT INTO food(brand, food_type, name, good_until, quantity_on_stock, animal_type) VALUES ('FLUVAL', 'DRY', 'FDC1', '2022-01-01', 24, 'CAT');
INSERT INTO food(brand, food_type, name, good_until, quantity_on_stock, animal_type) VALUES ('FLUVAL', 'DRY', 'FDC1', '2020-01-01', 3, 'CAT');
INSERT INTO food(brand, food_type, name, good_until, quantity_on_stock, animal_type) VALUES ('HIKARI', 'WET', 'FWF1', '2022-01-01', 9, 'FISH');

INSERT INTO cat_food(brand, food_type, name, good_until, quantity_on_stock) VALUES ('FLUVAL', 'DRY', 'FD1', '2022-01-01', 24);
INSERT INTO cat_food(brand, food_type, name, good_until, quantity_on_stock) VALUES ('FLUVAL', 'DRY', 'FD1', '2019-01-01', 3);
INSERT INTO cat_food(brand, food_type, name, good_until, quantity_on_stock) VALUES ('FLUVAL', 'BLOOD_WORM', 'FB1', '2023-08-01', 2);
INSERT INTO cat_food(brand, food_type, name, good_until, quantity_on_stock) VALUES ('FLUVAL', 'RAW', 'FR1', '2020-05-01', 11);
INSERT INTO cat_food(brand, food_type, name, good_until, quantity_on_stock) VALUES ('HIKARI', 'DRY', 'HD1', '2021-10-01', 1);
INSERT INTO cat_food(brand, food_type, name, good_until, quantity_on_stock) VALUES ('HIKARI', 'WET', 'HW1', '2021-12-01', 2);
INSERT INTO cat_food(brand, food_type, name, good_until, quantity_on_stock) VALUES ('HIKARI', 'FROZEN', 'HF1', '2022-10-01', 10);
INSERT INTO cat_food(brand, food_type, name, good_until, quantity_on_stock) VALUES ('NULO', 'WET', 'NF1', '2022-01-05', 0);
INSERT INTO cat_food(brand, food_type, name, good_until, quantity_on_stock) VALUES ('NULO', 'FROZEN', 'NF1', '2022-04-05', 3);
INSERT INTO cat_food(brand, food_type, name, good_until, quantity_on_stock) VALUES ('NULO', 'BLOOD_WORM', 'NB1', '2021-11-05', 21);
INSERT INTO cat_food(brand, food_type, name, good_until, quantity_on_stock) VALUES ('Whiskas', 'DRY', 'WD', '2024-01-01', 19);
INSERT INTO cat_food(brand, food_type, name, good_until, quantity_on_stock) VALUES ('Whiskas', 'WET', 'WW', '2024-03-01', 12);
INSERT INTO cat_food(brand, food_type, name, good_until, quantity_on_stock) VALUES ('Whiskas', 'RAW', 'WR', '2022-01-31', 9);
INSERT INTO cat_food(brand, food_type, name, good_until, quantity_on_stock) VALUES ('Whiskas', 'BLOOD_WORM', 'WB', '2024-02-01', 0);


INSERT INTO dog_food(brand, food_type, name, good_until, quantity_on_stock) VALUES ('FLUVAL', 'DRY', 'FD1', '2019-01-01', 1);
INSERT INTO dog_food(brand, food_type, name, good_until, quantity_on_stock) VALUES ('FLUVAL', 'BLOOD_WORM', 'FB1', '2023-08-01', 12);
INSERT INTO dog_food(brand, food_type, name, good_until, quantity_on_stock) VALUES ('FLUVAL', 'RAW', 'FR1', '2020-05-01', 31);
INSERT INTO dog_food(brand, food_type, name, good_until, quantity_on_stock) VALUES ('HIKARI', 'DRY', 'HD1', '2021-10-01', 10);
INSERT INTO dog_food(brand, food_type, name, good_until, quantity_on_stock) VALUES ('HIKARI', 'WET', 'HW1', '2021-12-01', 5);
INSERT INTO dog_food(brand, food_type, name, good_until, quantity_on_stock) VALUES ('HIKARI', 'FROZEN', 'HF1', '2022-10-01', 11);
INSERT INTO dog_food(brand, food_type, name, good_until, quantity_on_stock) VALUES ('NULO', 'WET', 'NF1', '2022-01-05', 6);
INSERT INTO dog_food(brand, food_type, name, good_until, quantity_on_stock) VALUES ('NULO', 'FROZEN', 'NF1', '2022-04-05', 32);
INSERT INTO dog_food(brand, food_type, name, good_until, quantity_on_stock) VALUES ('NULO', 'BLOOD_WORM', 'NB1', '2021-11-05', 1);
INSERT INTO dog_food(brand, food_type, name, good_until, quantity_on_stock) VALUES ('Whiskas', 'DRY', 'WD1', '2024-01-01', 10);
INSERT INTO dog_food(brand, food_type, name, good_until, quantity_on_stock) VALUES ('Whiskas', 'WET', 'WW1', '2024-03-01', 0);
INSERT INTO dog_food(brand, food_type, name, good_until, quantity_on_stock) VALUES ('Whiskas', 'RAW', 'WR1', '2022-01-31', 3);
INSERT INTO dog_food(brand, food_type, name, good_until, quantity_on_stock) VALUES ('Whiskas', 'BLOOD_WORM', 'WB1', '2024-02-01', 5);
INSERT INTO dog_food(brand, food_type, name, good_until, quantity_on_stock) VALUES ('FLUVAL', 'DRY', 'FDC1', '2022-01-01', 14);
INSERT INTO dog_food(brand, food_type, name, good_until, quantity_on_stock) VALUES ('FLUVAL', 'DRY', 'FDC1', '2020-01-01', 2);
INSERT INTO dog_food(brand, food_type, name, good_until, quantity_on_stock) VALUES ('HIKARI', 'FROZEN', 'FWF1', '2021-10-01', 10);
INSERT INTO dog_food(brand, food_type, name, good_until, quantity_on_stock) VALUES ('NULO', 'WET', 'FWF1', '2022-01-05', 8);
INSERT INTO dog_food(brand, food_type, name, good_until, quantity_on_stock) VALUES ('Whiskas', 'BLOOD_WORM', 'FWF1', '2024-01-01', 13);
INSERT INTO dog_food(brand, food_type, name, good_until, quantity_on_stock) VALUES ('FLUVAL', 'DRY', 'FD1', '2022-01-01', 12);
INSERT INTO dog_food(brand, food_type, name, good_until, quantity_on_stock) VALUES ('FLUVAL', 'DRY', 'FD1', '2020-01-01', 13);
INSERT INTO dog_food(brand, food_type, name, good_until, quantity_on_stock) VALUES ('HIKARI', 'FROZEN', 'HF1', '2021-10-01', 0);
INSERT INTO dog_food(brand, food_type, name, good_until, quantity_on_stock) VALUES ('NULO', 'WET', 'NW1', '2022-01-05', 2);
INSERT INTO dog_food(brand, food_type, name, good_until, quantity_on_stock) VALUES ('Whiskas', 'BLOOD_WORM', 'WB1', '2024-01-01', 9);

INSERT INTO fish_food(brand, food_type, name, good_until, quantity_on_stock) VALUES ('FLUVAL', 'DRY', 'FD1', '2019-01-01', 1);
INSERT INTO fish_food(brand, food_type, name, good_until, quantity_on_stock) VALUES ('FLUVAL', 'BLOOD_WORM', 'FB1', '2023-08-01', 12);
INSERT INTO fish_food(brand, food_type, name, good_until, quantity_on_stock) VALUES ('FLUVAL', 'RAW', 'FR1', '2020-05-01', 31);
INSERT INTO fish_food(brand, food_type, name, good_until, quantity_on_stock) VALUES ('HIKARI', 'DRY', 'HD1', '2021-10-01', 10);
INSERT INTO fish_food(brand, food_type, name, good_until, quantity_on_stock) VALUES ('HIKARI', 'WET', 'HW1', '2021-12-01', 5);
INSERT INTO fish_food(brand, food_type, name, good_until, quantity_on_stock) VALUES ('HIKARI', 'FROZEN', 'HF1', '2022-10-01', 11);
INSERT INTO fish_food(brand, food_type, name, good_until, quantity_on_stock) VALUES ('NULO', 'WET', 'NF1', '2022-01-05', 6);
INSERT INTO fish_food(brand, food_type, name, good_until, quantity_on_stock) VALUES ('NULO', 'FROZEN', 'NF1', '2022-04-05', 32);
INSERT INTO fish_food(brand, food_type, name, good_until, quantity_on_stock) VALUES ('NULO', 'BLOOD_WORM', 'NB1', '2021-11-05', 1);
INSERT INTO fish_food(brand, food_type, name, good_until, quantity_on_stock) VALUES ('Whiskas', 'DRY', 'WD1', '2024-01-01', 10);
INSERT INTO fish_food(brand, food_type, name, good_until, quantity_on_stock) VALUES ('Whiskas', 'WET', 'WW1', '2024-03-01', 0);
INSERT INTO fish_food(brand, food_type, name, good_until, quantity_on_stock) VALUES ('Whiskas', 'RAW', 'WR1', '2022-01-31', 3);
INSERT INTO fish_food(brand, food_type, name, good_until, quantity_on_stock) VALUES ('Whiskas', 'BLOOD_WORM', 'WB1', '2024-02-01', 5);
INSERT INTO fish_food(brand, food_type, name, good_until, quantity_on_stock) VALUES ('FLUVAL', 'DRY', 'FDC1', '2022-01-01', 14);
INSERT INTO fish_food(brand, food_type, name, good_until, quantity_on_stock) VALUES ('FLUVAL', 'DRY', 'FDC1', '2020-01-01', 2);
INSERT INTO fish_food(brand, food_type, name, good_until, quantity_on_stock) VALUES ('HIKARI', 'FROZEN', 'FWF1', '2021-10-01', 10);
INSERT INTO fish_food(brand, food_type, name, good_until, quantity_on_stock) VALUES ('NULO', 'WET', 'FWF1', '2022-01-05', 8);
INSERT INTO fish_food(brand, food_type, name, good_until, quantity_on_stock) VALUES ('Whiskas', 'BLOOD_WORM', 'FWF1', '2024-01-01', 13);
INSERT INTO fish_food(brand, food_type, name, good_until, quantity_on_stock) VALUES ('FLUVAL', 'DRY', 'FD1', '2022-01-01', 12);
INSERT INTO fish_food(brand, food_type, name, good_until, quantity_on_stock) VALUES ('FLUVAL', 'DRY', 'FD1', '2020-01-01', 13);
INSERT INTO fish_food(brand, food_type, name, good_until, quantity_on_stock) VALUES ('HIKARI', 'FROZEN', 'HF1', '2021-10-01', 0);
INSERT INTO fish_food(brand, food_type, name, good_until, quantity_on_stock) VALUES ('NULO', 'WET', 'NW1', '2022-01-05', 2);
INSERT INTO fish_food(brand, food_type, name, good_until, quantity_on_stock) VALUES ('Whiskas', 'BLOOD_WORM', 'WB1', '2024-01-01', 9);