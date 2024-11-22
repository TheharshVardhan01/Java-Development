   {
	   JTableDemoGSV jdv = new JTableDemoGSV();
	   jdv.setVisible(true);
	   jdv.setSize(500, 500);
	   jdv.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   
   }
   JTable jtd = null;
   
   public JTableDemoGSV() 
   {
    Object data[][]= {{12,"Amit Kumar",45.6f},
    				   {14,"Amitesh Kumar",65.6f},
    				   {15,"Kiran Kumar",65.6f}} ;
    String header[] = {"Sid","SName","Marks"};
    
    DefaultTableModel dtm  = new  DefaultTableModel(data,header); 
	jtd = new JTable(dtm);
	jtd.setRowHeight(20);
	JScrollPane jsp  = new JScrollPane(jtd);
	add(jsp);
   }
   