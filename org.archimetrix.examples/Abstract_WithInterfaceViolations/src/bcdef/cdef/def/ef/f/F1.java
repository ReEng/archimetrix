package bcdef.cdef.def.ef.f;

import a.A1;
import a.IA;
import bcdef.B1;
import bcdef.IB;
import bcdef.cdef.C1;
import bcdef.cdef.IC;
import bcdef.cdef.def.D1;
import bcdef.cdef.def.ID;
import bcdef.cdef.def.ef.E1;
import bcdef.cdef.def.ef.IE;

public class F1 implements IF
{

   @Override
   public void f()
   {
      
      IA ia = new A1();
      // Interface Violation
      A1 a = (A1) ia;
      a.a1();
      
      IB ib = new B1();
      // Interface Violation
      B1 b = (B1) ib;
      b.b1();
      
      
      IC ic = new C1();
      // Interface Violation
      C1 c = (C1) ic;
      c.c1();
      

      ID id = new D1();
      // Interface Violation
      D1 d = (D1) id;
      d.d1();
      

      IE ie = new E1();
      // Interface Violation
      E1 e = (E1) ie;
      e.e1();
   }

   public void f1()
   {
      // TODO Auto-generated method stub
      
   }
}
