object MutableVsImmutable //
{
        val mutHashMap = new scala.collection.mutable.HashMap[ String, Int ]
        val immHashMap = new scala.collection.immutable.HashMap[ String, Int ]

        def main( args : Array[ String ] ) // 
        {

                mutHashMap( "Foo" ) = 1
               // immHashMap( "Foo" ) = 1

                println( mutHashMap )
                // Prints:
                // Map(Foo -> 1)

                println( immHashMap )
                // Prints:
                // Map()

               // println( immHashMap( "Foo" ) = 1 )
                // Prints
                // Map(Foo -> 1)

        }
}