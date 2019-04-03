/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author emilly
 */
public class teste01 {
    public static void main(String[] args){
        
        filme f1= new filme();
        f1.nome="Rambo";
        f1.classe="14";
        f1.duração="1:25";
        
        filme f2= new filme();
        f2.nome="Joe";
        f2.classe="10";
        f2.duração="1:30";
        
        filme f3= new filme();
        f3.nome="Anaconda";
        f3.classe="14";
        f3.duração="2:25";
        
        System.out.println("nome f1 "+f1.nome);
        System.out.println("classe f2 "+f2.classe);
        System.out.println("duração f3 "+f3.duração);
        
        
        funcionario func1= new funcionario();
        func1.nome="Rodrigo";
        func1.idade="38";
        func1.sexo="M";
        
        funcionario func2= new funcionario();
        func2.nome="Fabiani";
        func2.idade="40";
        func2.sexo="F";
        
        funcionario func3= new funcionario();
        func3.nome="Enzo";
        func3.idade="18";
        func3.sexo="M";
        
        System.out.println("nome func1 "+func1.nome);
        System.out.println("idade func2 "+func2.idade);
        System.out.println("sexo func3 "+func3.sexo);
        
        produto pd1= new produto();
        pd1.nome= "Feijão";
        pd1.preço= "R$12";
        pd1.peso= "10 KG";    
        
        produto pd2= new produto();
        pd2.nome= "Farinha";
        pd2.preço= "R$ 5";
        pd2.peso= "15 KG";        
                
        
        produto pd3= new produto();
        pd3.nome= "Arroz";
        pd3.preço= "R$18";
        pd3.peso= "20 KG";  
        
        System.out.println("nome pd1 "+pd1.nome);
        System.out.println("preço pd2  "+pd2.preço);
        System.out.println("peso pd3 "+pd3.peso);
        
        
                
         
        
                
        
        
    }
    
    
}
