CREATE
DATABASE `thymenewsdb`;

CREATE TABLE `post`
(
    `id`          bigint       NOT NULL AUTO_INCREMENT,
    `content`     longtext     NOT NULL,
    `created_on`  datetime(6) DEFAULT NULL,
    `description` longtext     NOT NULL,
    `title`       varchar(255) NOT NULL,
    `updated_on`  datetime(6) DEFAULT NULL,
    `url`         varchar(255) DEFAULT NULL,
    PRIMARY KEY (`id`)
);

CREATE TABLE `comment`
(
    `id`         bigint       NOT NULL AUTO_INCREMENT,
    `content`    longtext     NOT NULL,
    `created_on` datetime(6) DEFAULT NULL,
    `email`      varchar(255) NOT NULL,
    `name`       varchar(255) NOT NULL,
    `updated_on` datetime(6) DEFAULT NULL,
    `post_id`    bigint       NOT NULL,
    PRIMARY KEY (`id`),
    KEY          `FKs1slvnkuemjsq2kj4h3vhx7i1` (`post_id`),
    CONSTRAINT `FKs1slvnkuemjsq2kj4h3vhx7i1` FOREIGN KEY (`post_id`) REFERENCES `post` (`id`)
);

INSERT INTO `post`
VALUES (1, ' Content goes here', '2023-03-16 10:45:18.617432', 'Learn important OOPS concepts in Java with examples',
        'OOPS Concepts in Java', '2023-03-16 10:45:18.617561', 'oops-concepts-in-java'),
       (2, ' Content goes here', '2023-03-17 10:45:18.630278', 'Learn about Variables in Java with examples',
        'Variables in Java', '2023-03-17 10:45:18.630297', 'variables-in-java'),
       (3, ' Content goes here', '2023-03-18 10:45:18.632620', 'Learn about Primitive Data Types in Java with examples',
        'Primitive Data Types in Java', '2023-03-18 10:45:18.632632', 'primitive-data-types-in-java'),
       (4, ' Content goes here', '2023-03-19 10:45:18.634347', 'Learn about Access Modifiers in Java with examples',
        'Access Modifiers in Java', '2023-03-19 10:45:18.634357', 'access-modifiers-in-java'),
       (5, ' Content goes here', '2023-03-20 10:45:18.635878', 'Learn about Arrays in Java with examples',
        'Arrays in Java', '2023-03-20 10:45:18.635889', 'arrays-in-java');

