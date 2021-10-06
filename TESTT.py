
tab = [1,2,9,10,34,6,67,88,9]
long = len(tab)
i = 0
v = i
comparaison = 0
echange = 0
while i < long-1:

    if tab[i] > tab[i+1]:
        comparaison +=1
        tmp = tab[i]        
        tab[i]=tab[i+1] 
        tab[i+1] = tmp
        echange +=3
        while tab[i] < tab[i-1]:
            comparaison +=1
            v = i   # car on peut pas incrementer et decrementer i a la fois
            i = v+1  #compensation du i = v-1
            if v > 0: 
                tmp = tab[v]        
                tab[v]=tab[v-1] 
                tab[v-1] = tmp
                v = i-1     #pour decaler le groupe des deux valeurs v et v-1 
                i = v -1    #pour que la condition while puisse être toujours vérifier on décremente 
                echange += 3
            else: 
                i+=1
                break
    else:        

      i=i+1
      comparaison+=1
      continue  