sol(argileux).
sol(limoneux).
sol(sableux).

temperature(trésfroid).
temperature(froid).
temperature(tempéré).
temperature(chaud).
temperature(tréschaud).

climat(tropical).
climat(mediterraneen).
climat(continental).

saison(hiver).
saison(été).
saison(automne).
saison(printemps).

% Facts about previous cultures
culturePrecedente(riz).
culturePrecedente(blé).
culturePrecedente(banane).
culturePrecedente(vigne).
culturePrecedente(ananas).
culturePrecedente(pommes_de_terre).
culturePrecedente(olivier).
culturePrecedente(cerisier).
culturePrecedente(pastèque).
culturePrecedente(dattier).
culturePrecedente(fraise).





% Recommandations pour un sol argileux
recommandation(argileux,tropical,trésfroid,hiver, Culture,CulturePrecedente) :-
    dif(Culture, CulturePrecedente), Culture = riz.
recommandation(argileux,mediterraneen,tempéré,printemps,Culture,CulturePrecedente) :-
    dif(Culture, CulturePrecedente), Culture = blé.
recommandation(argileux,tropical,chaud,été, Culture,CulturePrecedente) :-
    dif(Culture, CulturePrecedente), Culture = banane.
recommandation(argileux,mediterraneen,tempéré,printemps, Culture,CulturePrecedente) :-
    dif(Culture, CulturePrecedente), Culture = vigne.
recommandation(argileux,tropical,tréschaud,été, Culture,CulturePrecedente) :-
   dif(Culture, CulturePrecedente), Culture = ananas.
recommandation(argileux,continental,froid,hiver, Culture,CulturePrecedente) :-
    dif(Culture, CulturePrecedente), Culture = avoine.
recommandation(argileux, mediterraneen, tempéré, printemps, Culture,CulturePrecedente) :-
    dif(Culture, CulturePrecedente), Culture = tournesol.


% Recommandations pour un sol limoneux
recommandation(limoneux,continental,froid,automne, Culture,CulturePrecedente) :-
   dif(Culture, CulturePrecedente), Culture = pommes_de_terre.
recommandation(limoneux,mediterraneen,tempéré,automne,Culture,CulturePrecedente) :-
    dif(Culture, CulturePrecedente), Culture = olivier.
recommandation(limoneux,continental,froid,hiver, Culture,CulturePrecedente) :-
   dif(Culture, CulturePrecedente), Culture = cerisier.
recommandation(limoneux, mediterraneen, tempéré, automne, Culture,CulturePrecedente) :-
    dif(Culture, CulturePrecedente), Culture = vignoble.


% Recommandations pour un sol sableux
recommandation(sableux,tropical,chaud,été,Culture,CulturePrecedente) :-
   dif(Culture, CulturePrecedente), Culture = pastèque.
recommandation(sableux,tropical,chaud,été,Culture,CulturePrecedente) :-
   dif(Culture, CulturePrecedente), Culture = dattier.
recommandation(sableux,continental,froid,automne, Culture,CulturePrecedente) :-
  dif(Culture, CulturePrecedente), Culture = fraise.


recommandation(sableux,mediterraneen,tempéré,automne, Culture,CulturePrecedente) :-
    dif(Culture, CulturePrecedente), Culture = carotte.











