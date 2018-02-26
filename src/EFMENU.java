import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class EFMENU {
	
		static Process processo = null;    	  					
		static BufferedReader br = null;
	
  public static void main(String args[]) {
	  
    String labels[] = { 	"ROBOS RENOMEAR",
    						"1 - Banco do Brasil - Renomear Extrato PDF Judicial e IR", 
    						"2 - Banco do Brasil - Renomear Extrato PDF Judicial - Hiperlink", 
    						"3 - Caixa Economica - Renomear Extratos PDF Judicial", 
    						"4 - Caixa Economica - Renomear Extratos WORD Recursal",
    						" " ,
    						"ROBOS RELATORIO EXEL",
    						"1 - Banco do Brasil - Relatorios Excel Judicial",
    						"2 - Banco do Brasil - Relatorios Excel IR",
    						"3 - Caixa Economica - Relatorios Excel Judicial",
    						"4 - Caixa Economica - Relatorios Excel Recursal",
    						"5 - Processual	- Relatorios Excel Processual",
    						" ",
    						"ROBOS EXTRATOS",
    						"1 - Caixa Economica - Puxar Extratos Judicial",
    						"2 - Banco do Brasil - Puxar Extratos Judicial",
    						"3 - Banco do Brasil - Puxar Extratos IR",
    						" ",
    					};
    
    JFrame frame = new JFrame("EFICIENCIA FINANCEIRA");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container contentPane = frame.getContentPane();

    
    final JComboBox comboBox = new JComboBox(labels);
    comboBox.setMaximumRowCount(15);
    comboBox.setEditable(false);
    contentPane.add(comboBox, BorderLayout.NORTH);
    
    
    final JButton OK;
    OK = new JButton("Click aqui para chamar o Robo"); // construct a JButton
    contentPane.add(OK,BorderLayout.SOUTH);                     // add the button to the JFrame
    
    
    final JTextArea textArea = new JTextArea();
    textArea.setEditable(false);
    JScrollPane scrollPane = new JScrollPane(textArea);
    contentPane.add(scrollPane, BorderLayout.CENTER);

    
    ActionListener actionListener = new ActionListener() 
    {
      public void actionPerformed(ActionEvent actionEvent) 
      {
    	  		if(comboBox.getSelectedItem().equals("1 - Banco do Brasil - Renomear Extrato PDF Judicial e IR"))
    	  		{
    	  			textArea.setText(""
    	  					+ 		"\n"
    	  					+ 		" Robo que Renomeia Extratos do Banco do Brasil no formato PDF."
    	  					+ 		"\n"
    	  					+ 		"\n"
    	  					+ 		" Layout Renomeado:"
    	  					+ 		"\n"
    	  					+ 		" Nome_aamm  Valor  ContaJudicial  Parcela.pdf");
    	  		}
    	  		
    	  		
    	  		if(comboBox.getSelectedItem().equals("2 - Banco do Brasil - Renomear Extrato PDF Judicial - Hiperlink"))
    	  		{
    	  			textArea.setText(""
    	  					+ 		"\n"
    	  					+ 		" Robo que Renomeia Extratos do Banco do Brasil no formato PDF"
    	  					+ 		"\n"
    	  					+ 		" voltato para criacao de Hiperlink no Relatorio Excel."
    	  					+ 		"\n"			
    	  					+ 		"\n"
    	  					+ 		" Layout Renomeado:"
    	  					+ 		"\n"
    	  					+ 		" CJ  Parcela.pdf"
    	  					+ 		"\n"
    	  					+ 		"\n"
    	  					+ 		"\n"
    	  					+ 		"\n"
    	  					+ 		" ATENCAO ! ! ! "
    	  					+ 		"\n"
    	  					+ 		"\n"
    	  					+ 		" Cuidade ao Usar este Robo pois caso tenha Extratos"
    	  					+ 		"\n"
    	  					+		" com a mesma Conta Juridica com Meses diferentes, todos serao "
    	  					+ 		"\n"
    	  					+		" EXCLUIDOS Ficando apenas o mes mais recente. "
    	  					+ "");
    	  					
    	  		}
    	  		
    	  		
    	  		if(comboBox.getSelectedItem().equals("3 - Caixa Economica - Renomear Extratos PDF Judicial"))
    	  		{
    	  			textArea.setText(""
    	  					+ 		"\n"
    	  					+ 		" Robo que Renomeia Extratos da Caixa Economica no formato PDF."
    	  					+ 		"\n"
    	  					+ 		"\n"
    	  					+ 		" Layout Renomeado:"
    	  					+ 		"\n"
    	  					+ 		" Nome  Valor  ContaJudicial-Digito.pdf");
    	  		}
    	  		

    	  		if(comboBox.getSelectedItem().equals("4 - Caixa Economica - Renomear Extratos WORD Recursal"))
    	  		{
    	  			textArea.setText(""
    	  					+ 		"\n"
    	  					+ 		" Robo que Renomeia Extratos da Caixa Economica no formato Word"
    	  					+ 		"\n"
    	  					+ 		" WORD Recursal."
    	  					+ 		"\n"
    	  					+ 		"\n"
    	  					+ 		" Layout Renomeado:"
    	  					+ 		"\n"
    	  					+ 		" Nome  Valor  CodigoEmpregado.pdf");
    	  		}
    	  		
    	  		
    	  		if(comboBox.getSelectedItem().equals("1 - Banco do Brasil - Relatorios Excel Judicial"))
    	  		{
    	  			textArea.setText(""
    	  					+ 		"\n"
    	  					+ 		" Robo que gera o Relatorio em Excel BB Judicial - pdf"
    	  					+ 		"\n"
    	  					+ 		"\n"
    	  					+ 		"\n"
    	  					+ 		" OBS:"
    	  					+ 		"\n"
    	  					+ 		" O Excel usado para o preenchimento devera estar no formato .xlsx");
    	  		}
    	  		
    	  		if(comboBox.getSelectedItem().equals("2 - Banco do Brasil - Relatorios Excel IR"))
    	  		{
    	  			textArea.setText(""
    	  					+ 		"\n"
    	  					+ 		" Robo que gera o Relatorio em Excel BB Imposto de Renda - pdf "
    	  					+ 		"\n"
    	  					+ 		"\n"
    	  					+ 		"\n"
    	  					+ 		" OBS:"
    	  					+ 		"\n"
    	  					+ 		" O Excel usado para o preenchimento devera estar no formato .xlsx");
    	  		}
    	  		
    	  		
    	  		if(comboBox.getSelectedItem().equals("3 - Caixa Economica - Relatorios Excel Judicial"))
    	  		{
    	  			textArea.setText(""
    	  					+ 		"\n"
    	  					+ 		" Robo que gera o Relatorio em Excel CEF Judicial  - pdf"
    	  					+ 		"\n"
    	  					+ 		"\n"
    	  					+ 		"\n"
    	  					+ 		" OBS:"
    	  					+ 		"\n"
    	  					+ 		" O Excel usado para o preenchimento devera estar no formato .xlsx");
    	  		}
    	  		
    	  		
    	  		if(comboBox.getSelectedItem().equals("4 - Caixa Economica - Relatorios Excel Recursal"))
    	  		{
    	  			textArea.setText(""
    	  					+ 		"\n"
    	  					+ 		" Robo que gera o Relatorio em Excel CEF Recursal - Word "
    	  					+ 		"\n"
    	  					+ 		"\n"
    	  					+ 		"\n"
    	  					+ 		" OBS:"
    	  					+ 		"\n"
    	  					+ 		" O Excel usado para o preenchimento devera estar no formato .xlsx");
    	  		}

    	  		
    	  		if(comboBox.getSelectedItem().equals("1 - Caixa Economica - Puxar Extratos Judicial"))
    	  		{
    	  			textArea.setText(""
    	  					+ 		"\n"
    	  					+ 		" Robo que gera os Extratos Judiciais da Caixa Economica Federal"
    	  					+ 		"\n"
    	  					+ 		"\n"
    	  					+ 		" Pocedimentos:"
    	  					+ 		"\n"
    	  					+ 		" Antes de Executar este Robo, primeiro deve seguir os seguintes passos:"
    	  					+ 		"\n"
    	  					+ 		"\n"
    	  					+ 		"   1 - Criar o arquivo (.csv) no seguinte Layout:"
    	  					+ 		"\n"
    	  					+ 		"   \"AGEN\",\"OP\",\"CONTA\",\"DIGITO\""
    	  					+ 		"\n"
    	  					+ 		"   Exemplo:"
    	  					+ 		"\n"
    	  					+ 		"   \"3011\",\"42\",\"12131\",\"2\""
    	  					+ 		"\n"
    	  					+ 		"   \"2011\",\"42\",\"33131\",\"5\""
    	  					+ 		"\n"
    	  					+ 		"   \"1011\",\"42\",\"12555\",\"9\""
    	  					+ 		"\n"
    	  					+ 		"\n"
    	  					+ 		"   1.1 Ao finalizar o arquivo acima o mesmo devera ser salvo com o nome CEF.csv"
    	  					+ 		"\n"
    	  					+ 		"   no Diretorio C:/EF/CEF.csv"
    	  					+ 		"\n"
    	  					+ 		"\n"
    	  					+ 		"   2 - Abrir o Navegador FIREFOX e clicar no icone Imacros"
    	  					+ 		"\n"
    	  					+ 		"    2.1 - Abrir as Pastas CAIXAJUDICIAL/COMDATAFIM/OFICIAL"
    	  					+ 		"\n"
    	  					+ 		"    2.2 - Clicar com o Botao Direito em cima do arquivo CaixaScript... EditarMacro"
    	  					+ 		"\n"
    	  					+ 		"    2.3 - Na linha 11 Digitar a quantidade de extratos desejados"
    	  					+ 		"\n"
    	  					+ 		"    2.4 - Na linha 14 Digitar a data Base no formato DD/MM/AAAA"
    	  					+ 		"\n"
    	  					+ 		"    2.5 - Na linha 17 Digitar a Empresa Desejada representada na tela inicial do Site."
    	  					+ 		"\n"
    	  					+ 		"    2.6 - Na linha 20 Digitar o Usuario"
    	  					+ 		"\n"
    	  					+ 		"    2.7 - Na linha 23 Digitar a Senha"
    	  					+ 		"\n"
    	  					+ 		"    2.8 - Clicar em Salvar"
    	  					+ 		"\n"
    	  					+ 		"\n"
    	  					+ 		" Ao finalizar os passos acima o robo estara apto para baixar os Extratos."
    	  					+ 		"\n");
    	  		}
    	  		
    	  		
    	  		if(comboBox.getSelectedItem().equals("2 - Banco do Brasil - Puxar Extratos Judicial"))
    	  		{
    	  			textArea.setText(""
    	  					+ 		"\n"
    	  					+ 		" Robo que gera os Extratos Judiciais do Banco do Brasil Judicial"
    	  					+ 		"\n"
    	  					+ 		"\n"
    	  					+ 		" Pocedimentos:"
    	  					+ 		"\n"
    	  					+ 		" Antes de Executar este Robo, primeiro deve seguir os seguintes passos:"
    	  					+ 		"\n"
    	  					+ 		"\n"
    	  					+ 		"   1 - Criar o arquivo (.csv) no seguinte Layout:"
    	  					+ 		"\n"
    	  					+ 		"   \"CONTA JUDICIAL\",\"PARCELA\""
    	  					+ 		"\n"
    	  					+ 		"   Exemplo:"
    	  					+ 		"\n"
    	  					+ 		"   \"30119294042425\",\"1\""
    	  					+ 		"\n"
    	  					+ 		"   \"20115232223256\",\"2\""
    	  					+ 		"\n"
    	  					+ 		"   \"10117328973845\",\"10\""
    	  					+ 		"\n"
    	  					+ 		"\n"
    	  					+ 		"   1.1 Ao finalizar o arquivo acima o mesmo devera ser salvo com o nome BB.csv"
    	  					+ 		"\n"
    	  					+ 		"   no Diretorio C:/EF/BB.csv"
    	  					+ 		"\n"
    	  					+ 		"\n"
    	  					+ 		"   2 - Abrir o Navegador FIREFOX e clicar no icone Imacros"
    	  					+ 		"\n"
    	  					+ 		"    2.1 - Abrir as Pastas BBJUDICIAL/ComDataFim/Oficial"
    	  					+ 		"\n"
    	  					+ 		"    2.2 - Clicar com o Botao Direito em cima do arquivo ScriptGenericoParcelado... EditarMacro"
    	  					+ 		"\n"
    	  					+ 		"    2.3 - Na linha 11 Digitar a quantidade de extratos desejados"
    	  					+ 		"\n"
    	  					+ 		"    2.4 - Na linha 14 Digitar a data Base Inicio no formato DD/MM/AAAA"
    	  					+ 		"\n"
    	  					+ 		"    2.4 - Na linha 17 Digitar a data Base Fim no formato DD/MM/AAAA"    	  					
    	  					+ 		"\n"
    	  					+ 		"    2.8 - Clicar em Salvar"
    	  					+ 		"\n"
    	  					+ 		"\n"
    	  					+ 		" Ao finalizar os passos acima o robo estara apto para baixar os Extratos."
    	  					+ 		"\n");
    	  		}
    	  		
    	  		if(comboBox.getSelectedItem().equals("3 - Banco do Brasil - Puxar Extratos IR"))
    	  		{
    	  			textArea.setText(""
    	  					+ 		"\n"
    	  					+ 		" Robo que gera os Extratos Judiciais do Banco do Brasil PARA O IR"
    	  					+ 		"\n"
    	  					+ 		"\n"
    	  					+ 		" Pocedimentos:"
    	  					+ 		"\n"
    	  					+ 		" Antes de Executar este Robo, primeiro deve seguir os seguintes passos:"
    	  					+ 		"\n"
    	  					+ 		"\n"
    	  					+ 		"   1 - Criar o arquivo (.csv) no seguinte Layout:"
    	  					+ 		"\n"
    	  					+ 		"   \"CONTA JUDICIAL\",\"PARCELA\",\"DATA INICIO\",\"DATA FIM\""
    	  					+ 		"\n"
    	  					+ 		"   Exemplo:"
    	  					+ 		"\n"
    	  					+ 		"   \"30119294042425\",\"1\",\"01/01/2000\",\"31/01/2002\""
    	  					+ 		"\n"
    	  					+ 		"   \"20115232223256\",\"5\",\"10/05/2016\",\"01/03/2008\""
    	  					+ 		"\n"
    	  					+ 		"   \"10117328973845\",\"3\",\"05/11/1980\",\"10/12/2015\""
    	  					+ 		"\n"
    	  					+ 		"\n"
    	  					+ 		"   1.1 Ao finalizar o arquivo acima o mesmo devera ser salvo com o nome BBIR.csv"
    	  					+ 		"\n"
    	  					+ 		"   no Diretorio C:/EF/BBIR.csv"
    	  					+ 		"\n"
    	  					+ 		"\n"
    	  					+ 		"   2 - Abrir o Navegador FIREFOX e clicar no icone Imacros"
    	  					+ 		"\n"
    	  					+ 		"    2.1 - Abrir as Pastas BBIR/"
    	  					+ 		"\n"
    	  					+ 		"    2.2 - Clicar com o Botao Direito em cima do arquivo BB_IR... EditarMacro"
    	  					+ 		"\n"
    	  					+ 		"    2.3 - Na linha 11 Digitar a quantidade de extratos desejados"
    	  					+ 		"\n"
    	  					+ 		"    2.8 - Clicar em Salvar"
    	  					+ 		"\n"
    	  					+ 		"\n"
    	  					+ 		" Ao finalizar os passos acima o robo estara apto para baixar os Extratos."
    	  					+ 		"\n");
    	  		}
    	  		
    	  		if(comboBox.getSelectedItem().equals("5 - Processual	- Relatorios Excel Processual"))
    	  		{
    	  			textArea.setText(""
    	  					+ 		"\n"
    	  					+ 		" Robo que atualiza as informacoes processuais tais como:"
    	  					+ 		"\n"
    	  					+ 		" Numero do processo, Vara, Comarca, Reu e Autor:"
    	  					+ 		"\n"
    	  					+ 		"\n"
    	  					+ 		" Importante:"
    	  					+ 		"\n"
    	  					+ 		" Apenas o formato Eletronico esta disponivel"
    	  					+ 		"\n");
    	  		}
    	  		
    	  		
    	  		
      }
    };
    
    comboBox.addActionListener(actionListener);

    
    OK.addActionListener(new java.awt.event.ActionListener() 
    {
        public void actionPerformed(java.awt.event.ActionEvent evt) 
        {
    	  		if(comboBox.getSelectedItem().equals("1 - Banco do Brasil - Renomear Extrato PDF Judicial e IR"))
    	  		{
    	  			System.out.println("VAI CHAMAR O ROBO: 1 - Banco do Brasil - Renomear Extrato PDF Judicial ");
    	  			
    	  			try 
    	  			{
    	  				//Runtime.getRuntime().exec("C:\\ROBOS\\EFROBOBBPDF.bat"); 
    	  				
	  				 	processo = Runtime.getRuntime().exec("C:\\ROBOS\\EFROBOBBPDF.bat");    	  					
     	  				br = new BufferedReader(new InputStreamReader(processo.getInputStream()));
     	  				
     	  				String linha;    	  					
     	  				while((linha = br.readLine()) != null)
     	  				{
     	            			System.out.println(linha);    	  	            			
   	  	            		//textArea.setText(linha);
     	    	  			}
    	  			}
    	  			catch (IOException e) 
    	  			{
    	  				e.printStackTrace();
    	  			}
    	  		}
    	  		
    	  		if(comboBox.getSelectedItem().equals("2 - Banco do Brasil - Renomear Extrato PDF Judicial - Hiperlink"))
    	  		{
    	  			System.out.println("VAI CHAMAR O ROBO: 2 - Banco do Brasil - Renomear Estrato PDF Judicial - Hiperlink ");
    	  			
    	  			try 
    	  			{
    	  				//Runtime.getRuntime().exec("C:\\ROBOS\\ROBOBBPDF-CUIDADO-CJePARCELA.bat"); 
    	  				
	  				 	processo = Runtime.getRuntime().exec("C:\\ROBOS\\ROBOBBPDF-CUIDADO-CJePARCELA.bat");    	  					
     	  				br = new BufferedReader(new InputStreamReader(processo.getInputStream()));
     	  				
     	  				String linha;    	  					
     	  				while((linha = br.readLine()) != null)
     	  				{
     	            			System.out.println(linha);    	  	            			
   	  	            		//textArea.setText(linha);
     	    	  			}
    	  			}
    	  			catch (IOException e) 
    	  			{
    	  				e.printStackTrace();
    	  			}
    	  		}
    	  		
    	  		if(comboBox.getSelectedItem().equals("3 - Caixa Economica - Renomear Extratos PDF Judicial"))
    	  		{
    	  			System.out.println("VAI CHAMAR O ROBO: 3 - Caixa Economica - Renomear Extratos PDF Judicial ");
    	  			
    	  			try 
    	  			{
    	  				//Runtime.getRuntime().exec("C:\\ROBOS\\EFROBOCEFPDF.bat"); 
    	  				
	  				 	processo = Runtime.getRuntime().exec("C:\\ROBOS\\EFROBOCEFPDF.bat");    	  					
      	  				 br = new BufferedReader(new InputStreamReader(processo.getInputStream()));
      	  				
      	  				String linha;    	  					
      	  				while((linha = br.readLine()) != null)
      	  				{
      	            			System.out.println(linha);    	  	            			
    	  	            		//textArea.setText(linha);
      	    	  			}
    	  			}
    	  			catch (IOException e) 
    	  			{
    	  				e.printStackTrace();
    	  			}
    	  		}
    	  		
    	  		if(comboBox.getSelectedItem().equals("4 - Caixa Economica - Renomear Extratos WORD Recursal"))
    	  		{
    	  			System.out.println("VAI CHAMAR O ROBO: 4 - Caixa Economica - Renomear Extratos WORD Recursal");
    	  			
    	  			try 
    	  			{
    	  				//Runtime.getRuntime().exec("C:\\ROBOS\\ROBORECURSALWORD.bat"); 
    	  				
    	  				 	processo = Runtime.getRuntime().exec("C:\\ROBOS\\ROBORECURSALWORD.bat");    	  					
       	  				 br = new BufferedReader(new InputStreamReader(processo.getInputStream()));
       	  				
       	  				String linha;    	  					
       	  				while((linha = br.readLine()) != null)
       	  				{
       	            			System.out.println(linha);    	  	            			
     	  	            		//textArea.setText(linha);
       	    	  			}
    	  			}
    	  			catch (IOException e) 
    	  			{
    	  				e.printStackTrace();
    	  			}
    	  		}
    	  		
    	  		
    	  		if(comboBox.getSelectedItem().equals("1 - Banco do Brasil - Relatorios Excel Judicial"))
    	  		{
    	  			System.out.println("VAI CHAMAR O ROBO: 1 - Banco do Brasil - Relatorios Excel Judicial");
    	  			
    	  			try 
    	  			{
    	  				//Runtime.getRuntime().exec("C:\\ROBOS\\EFROBOEXCELBB.bat"); 
    	  				
     	  				 processo = Runtime.getRuntime().exec("C:\\ROBOS\\EFROBOEXCELBB.bat");    	  					
       	  				 br = new BufferedReader(new InputStreamReader(processo.getInputStream()));
       	  				
       	  				String linha;    	  					
       	  				while((linha = br.readLine()) != null)
       	  				{
       	            			System.out.println(linha);    	  	            			
     	  	            		//textArea.setText(linha);
       	    	  			}
    	  			}
    	  			catch (IOException e) 
    	  			{
    	  				e.printStackTrace();
    	  			}
    	  		}
    	  		
    	  		
    	  		
    	  		if(comboBox.getSelectedItem().equals("2 - Banco do Brasil - Relatorios Excel IR"))
    	  		{
    	  			System.out.println("VAI CHAMAR O ROBO: 2 - Banco do Brasil - Relatorios Excel IR");
    	  			
    	  			try 
    	  			{
    	  				//Runtime.getRuntime().exec("C:\\ROBOS\\EFROBOEXCELIRBB.bat"); 
    	  				
      	  				 processo = Runtime.getRuntime().exec("C:\\ROBOS\\EFROBOEXCELIRBB.bat");    	  					
       	  				 br = new BufferedReader(new InputStreamReader(processo.getInputStream()));
       	  				
       	  				String linha;    	  					
       	  				while((linha = br.readLine()) != null)
       	  				{
       	            			System.out.println(linha);    	  	            			
     	  	            		//textArea.setText(linha);
       	    	  			}

    	  			}
    	  			catch (IOException e) 
    	  			{
    	  				e.printStackTrace();
    	  			}
    	  		}
    	  		
    	  		if(comboBox.getSelectedItem().equals("3 - Caixa Economica - Relatorios Excel Judicial"))
    	  		{
    	  			System.out.println("VAI CHAMAR O ROBO: 3 - Caixa Economica - Relatorios Excel Judicial");
    	  			
    	  			try 
    	  			{
    	  				//Runtime.getRuntime().exec("C:\\ROBOS\\EFROBOEXCELCAIXA.bat"); 
    	  				
   	  				 processo = Runtime.getRuntime().exec("C:\\ROBOS\\EFROBOEXCELCAIXA.bat");    	  					
   	  				 br = new BufferedReader(new InputStreamReader(processo.getInputStream()));
   	  				
   	  				String linha;    	  					
   	  				while((linha = br.readLine()) != null)
   	  				{
   	            			System.out.println(linha);    	  	            			
 	  	            		//textArea.setText(linha);
   	    	  			}
    	  			}
    	  			catch (IOException e) 
    	  			{
    	  				e.printStackTrace();
    	  			}
    	  		}
    	  		
    	  		
    	  		if(comboBox.getSelectedItem().equals("4 - Caixa Economica - Relatorios Excel Recursal"))
    	  		{
    	  			System.out.println("VAI CHAMAR O ROBO: 4 - Caixa Economica - Relatorios Excel Recursal");
    	  			
    	  			try 
    	  			{
    	  				//Runtime.getRuntime().exec("C:\\ROBOS\\EFROBOEXCELRECURSAL.bat");

    	  				 processo = Runtime.getRuntime().exec("C:\\ROBOS\\EFROBOEXCELRECURSAL.bat");    	  					
    	  				 br = new BufferedReader(new InputStreamReader(processo.getInputStream()));
    	  				
    	  				String linha;    	  					
    	  				while((linha = br.readLine()) != null)
    	  				{
    	            			System.out.println(linha);    	  	            			
  	  	            		//textArea.setText(linha);
    	    	  			}
    	  				

    	  			}
    	  			catch (IOException e) 
    	  			{
    	  				e.printStackTrace();
    	  			}
    	  		}
    	  		
    	  		
       	  	if(comboBox.getSelectedItem().equals("1 - Caixa Economica - Puxar Extratos Judicial"))
    	  		{
    	  			System.out.println("VAI CHAMAR O ROBO: 1 - Caixa Economica - Puxar Extratos Judicial");
    	  			
    	  			try 
    	  			{
    	  				//Runtime.getRuntime().exec("C:\\ROBOS\\EXTRATO_CAIXA_COMDATAFIM.bat");

    	  				 processo = Runtime.getRuntime().exec("C:\\ROBOS\\EXTRATO_CAIXA_COMDATAFIM.bat");    	  					
    	  				 br = new BufferedReader(new InputStreamReader(processo.getInputStream()));
    	  				
    	  				String linha;    	  					
    	  				while((linha = br.readLine()) != null)
    	  				{
    	            			System.out.println(linha);    	  	            			
  	  	            		//textArea.setText(linha);
    	    	  			}
    	  				

    	  			}
    	  			catch (IOException e) 
    	  			{
    	  				e.printStackTrace();
    	  			}
    	  		}
       	  	
       	 
       	 
    	  	if(comboBox.getSelectedItem().equals("2 - Banco do Brasil - Puxar Extratos Judicial"))
 	  		{
 	  			System.out.println("VAI CHAMAR O ROBO: 2 - Banco do Brasil - Puxar Extratos Judicial");
 	  			
 	  			try 
 	  			{
 	  				//Runtime.getRuntime().exec("C:\\ROBOS\\EXTRATO_CAIXA_COMDATAFIM.bat");

 	  				 processo = Runtime.getRuntime().exec("C:\\ROBOS\\EXTRATO_BB_PARCELADO.bat");    	  					
 	  				 br = new BufferedReader(new InputStreamReader(processo.getInputStream()));
 	  				
 	  				String linha;    	  					
 	  				while((linha = br.readLine()) != null)
 	  				{
 	            			System.out.println(linha);    	  	            			
	  	            		//textArea.setText(linha);
 	    	  			}
 	  				

 	  			}
 	  			catch (IOException e) 
 	  			{
 	  				e.printStackTrace();
 	  			}
 	  		}
       	  	
       	  	if(comboBox.getSelectedItem().equals("3 - Banco do Brasil - Puxar Extratos IR"))
    	  		{
    	  			System.out.println("VAI CHAMAR O ROBO: 3 - Banco do Brasil - Puxar Extratos IR");
    	  			
    	  			try 
    	  			{
    	  				//Runtime.getRuntime().exec("C:\\ROBOS\\EXTRATO_CAIXA_COMDATAFIM.bat");

    	  				 processo = Runtime.getRuntime().exec("C:\\ROBOS\\EXTRATO_BB_IR.bat");    	  					
    	  				 br = new BufferedReader(new InputStreamReader(processo.getInputStream()));
    	  				
    	  				String linha;    	  					
    	  				while((linha = br.readLine()) != null)
    	  				{
    	            			System.out.println(linha);    	  	            			
  	  	            		//textArea.setText(linha);
    	    	  			}
    	  				

    	  			}
    	  			catch (IOException e) 
    	  			{
    	  				e.printStackTrace();
    	  			}
    	  		}
       	  	
       	  	if(comboBox.getSelectedItem().equals("5 - Processual	- Relatorios Excel Processual"))
    	  		{
    	  			System.out.println("VAI CHAMAR O ROBO: 5 - Processual	- Relatorios Excel Processual");
    	  			
    	  			try 
    	  			{
    	  				//Runtime.getRuntime().exec("C:\\ROBOS\\EXTRATO_CAIXA_COMDATAFIM.bat");

    	  				 processo = Runtime.getRuntime().exec("C:\\ROBOS\\EFROBOPROCESSUAL.bat");    	  					
    	  				 br = new BufferedReader(new InputStreamReader(processo.getInputStream()));
    	  				
    	  				String linha;    	  					
    	  				while((linha = br.readLine()) != null)
    	  				{
    	            			System.out.println(linha);    	  	            			
  	  	            		//textArea.setText(linha);
    	    	  			}
    	  				

    	  			}
    	  			catch (IOException e) 
    	  			{
    	  				e.printStackTrace();
    	  			}
    	  		}
       	  	
       	 
       	  		
    	  		
    	  		
        }
    }); 

    

    

    frame.setSize(550, 330);
    frame.setVisible(true);
    
    
//    new Thread(new Runnable() {
//        public void run() {
//  			textArea.setText(tela);
//        }
//    }).start();
//    
    

    
  }


}
