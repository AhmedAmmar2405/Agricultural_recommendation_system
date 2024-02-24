







% Recommandations pour un sol argileux
% recommandation(argileux,tropical,trésfroid,hiver, Culture,CulturePrecedente) :-
  %   dif(Culture, CulturePrecedente),Culture = riz.
% recommandation(argileux,mediterraneen,tempéré,printemps,Culture,CulturePrecedente) :-
%    dif(Culture, CulturePrecedente), Culture = blé.
% recommandation(argileux,tropical,chaud,été, Culture,CulturePrecedente) :-
 %   dif(Culture, CulturePrecedente), Culture = banane.
% recommandation(argileux,mediterraneen,tempéré,printemps, Culture,CulturePrecedente) :-
 %   dif(Culture, CulturePrecedente), Culture = vigne.
% recommandation(argileux,tropical,tréschaud,été, Culture,CulturePrecedente) :-
 %  dif(Culture, CulturePrecedente), Culture = ananas.
% recommandation(argileux,continental,froid,hiver, Culture,CulturePrecedente) :-
 %   dif(Culture, CulturePrecedente), Culture = avoine.
% recommandation(argileux, mediterraneen, tempéré, printemps, Culture,CulturePrecedente) :-
  %  dif(Culture, CulturePrecedente), Culture = tournesol.


% Recommandations pour un sol limoneux
% recommandation(limoneux,continental,froid,automne, Culture,CulturePrecedente) :-
  % dif(Culture, CulturePrecedente), Culture = pommes_de_terre.

% recommandation(limoneux,continental,froid,hiver, Culture,CulturePrecedente) :-
  % dif(Culture, CulturePrecedente), Culture = cerisier.
% recommandation(limoneux, mediterraneen, tempéré, automne, Culture,CulturePrecedente) :-
  %  dif(Culture, CulturePrecedente), Culture = vignoble.


% Recommandations pour un sol sableux
%recommandation(sableux,tropical,chaud,été,Culture,CulturePrecedente) :-
 %  dif(Culture, CulturePrecedente), Culture = pastèque.
%recommandation(sableux,tropical,chaud,été,Culture,CulturePrecedente) :-
%   dif(Culture, CulturePrecedente), Culture = dattier.
% recommandation(sableux,continental,froid,automne, Culture,CulturePrecedente) :-
 % dif(Culture, CulturePrecedente), Culture = fraise.


% recommandation(sableux,mediterraneen,tempéré,automne, Culture,CulturePrecedente) :-
   % dif(Culture, CulturePrecedente), Culture = carotte.
recommandation(W,Z,Y,X,Culture,CulturePrecedente) :-

    sol_prefere(Culture,W),
    climat_prefere(Culture,Z),
    periode_plantation(Culture,X),
    temperature_optimale(Culture,Y),
    Culture \== CulturePrecedente.

% Période de plantation pour différentes cultures
periode_plantation(riz, printemps).
periode_plantation(ble, automne).
periode_plantation(vigne, automne).
periode_plantation(banane,hiver).
periode_plantation(avoine, printemps).

periode_plantation(ananas, été).
periode_plantation(pommes_de_terre, été).

periode_plantation(olivier, été).
periode_plantation(cerisier, automne).

periode_plantation(pasteque, printemps).
periode_plantation(dattier, printemps).

periode_plantation(fraise,hiver).
periode_plantation(tournesol, printemps).
periode_plantation(vignoble, hiver).
periode_plantation(carotte, automne).


temperature_optimale(riz, chaud).
temperature_optimale(blé, tempéré).
temperature_optimale(vigne, tempéré).
temperature_optimale(banane, chaud).
temperature_optimale(avoine, froid).
temperature_optimale(ananas, tréschaud).
temperature_optimale(pommes_de_terre, tempéré).
temperature_optimale(olivier, tempéré).
temperature_optimale(cerisier, froid).
temperature_optimale(pasteque, chaud).
temperature_optimale(dattier, tréschaud).
temperature_optimale(fraise, tempéré).
temperature_optimale(tournesol, tempéré).
temperature_optimale(vignoble, tempéré).
temperature_optimale(carotte, tempéré).

climat_prefere(riz, tropical).
climat_prefere(blé, mediterraneen).
climat_prefere(vigne, mediterraneen).
climat_prefere(banane, tropical).
climat_prefere(avoine, continental).
climat_prefere(ananas, tropical).
climat_prefere(pommes_de_terre,mediterraneen).
climat_prefere(olivier,mediterraneen ).
climat_prefere(cerisier,continental).
climat_prefere(pasteque,tropical).
climat_prefere(dattier, tropical).
climat_prefere(fraise,continental).
climat_prefere(tournesol, continental).
climat_prefere(vignoble, mediterraneen).
climat_prefere(carotte,continental).




% Sol préféré pour chaque culture
sol_prefere(riz, limoneux).
sol_prefere(blé, limoneux).
sol_prefere(vigne, limoneux).
sol_prefere(banane, limoneux).
sol_prefere(avoine, limoneux).
sol_prefere(ananas, limoneux).
sol_prefere(olivier, argileux).
sol_prefere(cerisier, argileux).
sol_prefere(vignoble, argileux).
sol_prefere(pommes_de_terre, argileux).
sol_prefere(pasteque, sableux).
sol_prefere(dattier, sableux).
sol_prefere(fraise, sableux).
sol_prefere(tournesol, sableux).
sol_prefere(carotte, sableux).



methode_cultiv(riz, inondation).
methode_cultiv(blé, semis_direct).
methode_cultiv(vigne, treillis).
methode_cultiv(banane, plantation_touffe).
methode_cultiv(avoine, semis_direct).
methode_cultiv(ananas, plantation_touffe).
methode_cultiv(olivier, greffage).
methode_cultiv(cerisier, semis_direct).
methode_cultiv(vignoble, treillis).
methode_cultiv(pommes_de_terre, buttage).
methode_cultiv(pasteque, semis_direct).
methode_cultiv(dattier, plantation_touffe).
methode_cultiv(fraise, stolon).
methode_cultiv(tournesol, semis_direct).
methode_cultiv(carotte, semis_direct).














































































