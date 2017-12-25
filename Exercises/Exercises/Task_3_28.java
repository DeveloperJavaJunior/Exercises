import java.util.Scanner;
public class Task_3_28 {

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		
				
				System.out.println("Unesi podatke o prvom pravougaoniku(centar po x i y osi,sirinu i visinu):\n");
				float x1=unos.nextFloat();
				float y1=unos.nextFloat();
				float s1=unos.nextFloat();
				float v1=unos.nextFloat();
				
				System.out.println("Unesi podatke o drugom pravougaoniku(centar po x i y osi,sirinu i visinu):\n");
				float x2=unos.nextFloat();
				float y2=unos.nextFloat();
				float s2=unos.nextFloat();
				float v2=unos.nextFloat();
				unos.close();
				//Sada raèunam koordinate donje lijeve i gornje desne ivice prvog pravougaonika
				float p1t1x=x1-(s1/2);	//donja lijeva po x osi (pravougaonik 1 - taèka 1 - po x osi)
				float p1t1y=y1-(v1/2);	//donja lijeva po y osi
				float p1t2x=x1+(s1/2);	//gornja desna po x osi
				float p1t2y=y1+(v1/2);	//gornja desna po y osi
				
				//Sada raèunam koordinate donje lijeve i gornje desne ivice drugog pravougaonika
				float p2t1x=x2-(s2/2);	//donja lijeva po x osi
				float p2t1y=y2-(v2/2);	//donja lijeva po y osi
				float p2t2x=x2+(s2/2);	//gornja desna po x osi
				float p2t2y=y2+(v2/2);	//gornja desna po y osi
				
				System.out.println(p1t1x+" "+p1t1y+" "+p1t2x+" "+p1t2y+"\n"+p2t1x+" "+p2t1y+" "+p2t2x+" "+p2t2y);
				
				if( ( (p2t1x)>=(p1t1x)  &&  (p2t1x)<=(p1t2x)  &&  (p2t1y>=p1t1y)  &&  (p2t1y<=p1t2y) ) &&
		                    ( (p2t2x)>=(p1t1x)  &&  (p2t2x)<=(p1t2x)  &&  (p2t2y>=p1t1y)  &&  (p2t2y<=p1t2y) )
				   )
				{
					System.out.println("Drugi pravougaonik se nalazi unutar prvog");
				}
				else if( ( (p2t1x)>=(p1t1x)  &&  (p2t1x)<=(p1t2x)  &&  (p2t1y>=p1t1y)  &&  (p2t1y<=p1t2y) ) ||
		                         ( (p2t2x)>=(p1t1x)  &&  (p2t2x)<=(p1t2x)  &&  (p2t2y>=p1t1y)  &&  (p2t2y<=p1t2y) )
					)
				{
					System.out.println("Sijeku se");
				}

			}

}
