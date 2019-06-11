insert into article
values(
1,
'Soviet N1 Rocket that failed to go to the moon',
'In the 60\s, cold war is at it\s peek and the race to the moon concentrate the best scientific efforts of the two blocks. The N1 rocket is built as a response to the massive Saturn V launcher.',
'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.',
'../assets/images/article1.jpg',
'A N1 rocket on the launching stand'
);

insert into article_tag (article_id, tag_id)
values
(1, 1),
(1, 2)
;

insert into article
values(
2,
'Top 10 of the viruses that nearly destroyed humanity.',
'Form the Black Plague to the HIV, human race as always been threatened by epidemics. Among theses viruses, some of them were close to destroy humanity.',
'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.',
'../assets/images/article2.jpg',
'An artist view of viruses on blue background'
);

insert into article_tag (article_id, tag_id)
values
(2, 1),
(2, 3)
;

insert into article
values(
3,
'Why you should go to a hockey game in Canada.',
'An article to explain why you should spend 200$ on a ticket to see armored guys battle on ice.',
'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.',
'../assets/images/article3.jpg',
'Hockey players of two teams around the goal'
);

insert into article_tag (article_id, tag_id)
values
(3, 4),
(3, 5)
;

insert into article
values(
4,
'Marquez VS Rossi, the battle on GP tracks.',
'The first one won the world championish on his first year at the age of 20. The second is 9 times world champion and on track for more than 15 years. A clash of generations.',
'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.',
'../assets/images/article4.jpg',
'Marquez and Rossi on their bikes, elbow to elbow in a tight corner'
);

insert into article_tag (article_id, tag_id)
values
(4, 4),
(4, 6);

insert into article
values(
5,
'D.Trump to Kim Jon Un : "My red button is bigger"',
'Once again, the US president uses his legendary diplomatic way to cool down relations with North Korea. Another great lesson in geopolitics.',
'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.',
'../assets/images/article5.jpg',
'Donald Trump doing a speech, joining his index finger and his thumb '
);

insert into article_tag (article_id, tag_id)
values
(5, 7),
(5, 8),
(5, 9);

insert into article
values(
6,
'France: yellow jackets riots knockin on Macron''s door.',
'For the fourth consecutive saturday, the yellow jackets filled the streets of France. E.Macron stays deaf to his people and send more police.',
'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.',
'../assets/images/article6.jpg',
'A demonstrator wearing a hoodie and a yellow jacket throwing back a lacrymogene.'
);

insert into article_tag (article_id, tag_id)
values
(6, 7),
(6, 10),
(6, 11)
;

insert into tag
values(
1, 'science'
);

insert into tag
values(
2, 'space'
);

insert into tag
values(
3, 'medecine'
);

insert into tag
values(
4, 'sport'
);

insert into tag
values(
5, 'hockey'
);

insert into tag
values(
6, 'motoGP'
);

insert into tag
values(
7, 'politics'
);

insert into tag
values(
8, 'trump'
);

insert into tag
values(
9, 'usa'
);

insert into tag
values(
10, 'france'
);

insert into tag
values(
11, 'yellow jacket'
);