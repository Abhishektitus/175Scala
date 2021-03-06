Problem Scenario 67 : You have been given below code snippet. 

lines = sc.parallelize(List['its fun to have fun,','but you have to know how.']) 
rl = lines.map( lambda x: x.replace(',',' ').replace('.',' ').replace('-',' ').lower()) 
r2 = rl.flatMap(lambda x: x.split()) 
r3 = r2.map(lambda x: (x, 1)) 
operationl 

r5 = r4.map(lambda x:(x[1].x[0])) 
r6 = r5.sortByKey(ascending=False) 
r6.take(20) 

Write a correct code snippet for operationl which will produce desired output, shown below. 
[(2,'fun'), (2, 'to'), (2, 'have'), (1, 'its'), (1, 'know'), (1, 'how'), (1,'you'), (1, 'but')) 

==========================================================================
Solution : 
r4 = r3.reduceByKéY(lambda x,y:x+y) 

val a = sc.parallelize(List("cat","horse",4.0,3.5,2,"dog"))

val b = a.flatMap {
  case v: Int => Some(v)
  case v: Double => Some(v)
  case _ => None
}


