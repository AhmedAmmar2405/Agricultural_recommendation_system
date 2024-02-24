sol(argileux).
sol(limoneux).
sol(sableux).

temperature(tr�sfroid).
temperature(froid).
temperature(temp�r�).
temperature(chaud).
temperature(tr�schaud).

climat(tropical).
climat(mediterraneen).
climat(continental).

saison(hiver).
saison(�t�).
saison(automne).
saison(printemps).

% Facts about previous cultures
culturePrecedente(riz).
culturePrecedente(bl�).
culturePrecedente(banane).
culturePrecedente(vigne).
culturePrecedente(ananas).
culturePrecedente(pommes_de_terre).
culturePrecedente(olivier).
culturePrecedente(cerisier).
culturePrecedente(past�que).
culturePrecedente(dattier).
culturePrecedente(fraise).





% Recommandations pour un sol argileux
recommandation(argileux,tropical,tr�sfroid,hiver, Culture,CulturePrecedente) :-
    dif(Culture, CulturePrecedente), Culture = riz.
recommandation(argileux,mediterraneen,temp�r�,printemps,Culture,CulturePrecedente) :-
    dif(Culture, CulturePrecedente), Culture = bl�.
recommandation(argileux,tropical,chaud,�t�, Culture,CulturePrecedente) :-
    dif(Culture, CulturePrecedente), Culture = banane.
recommandation(argileux,mediterraneen,temp�r�,printemps, Culture,CulturePrecedente) :-
    dif(Culture, CulturePrecedente), Culture = vigne.
recommandation(argileux,tropical,tr�schaud,�t�, Culture,CulturePrecedente) :-
   dif(Culture, CulturePrecedente), Culture = ananas.
recommandation(argileux,continental,froid,hiver, Culture,CulturePrecedente) :-
    dif(Culture, CulturePrecedente), Culture = avoine.
recommandation(argileux, mediterraneen, temp�r�, printemps, Culture,CulturePrecedente) :-
    dif(Culture, CulturePrecedente), Culture = tournesol.


% Recommandations pour un sol limoneux
recommandation(limoneux,continental,froid,automne, Culture,CulturePrecedente) :-
   dif(Culture, CulturePrecedente), Culture = pommes_de_terre.
recommandation(limoneux,mediterraneen,temp�r�,automne,Culture,CulturePrecedente) :-
    dif(Culture, CulturePrecedente), Culture = olivier.
recommandation(limoneux,continental,froid,hiver, Culture,CulturePrecedente) :-
   dif(Culture, CulturePrecedente), Culture = cerisier.
recommandation(limoneux, mediterraneen, temp�r�, automne, Culture,CulturePrecedente) :-
    dif(Culture, CulturePrecedente), Culture = vignoble.


% Recommandations pour un sol sableux
recommandation(sableux,tropical,chaud,�t�,Culture,CulturePrecedente) :-
   dif(Culture, CulturePrecedente), Culture = past�que.
recommandation(sableux,tropical,chaud,�t�,Culture,CulturePrecedente) :-
   dif(Culture, CulturePrecedente), Culture = dattier.
recommandation(sableux,continental,froid,automne, Culture,CulturePrecedente) :-
  dif(Culture, CulturePrecedente), Culture = fraise.


recommandation(sableux,mediterraneen,temp�r�,automne, Culture,CulturePrecedente) :-
    dif(Culture, CulturePrecedente), Culture = carotte.











