import java.util.ArrayList;
import java.util.List;

public class PythagoreanTriplet{

    private final int a;

    private final int b;

    private final int c;

    public PythagoreanTriplet(int a, int b, int c){

        if ( !( a*a + b*b == c*c && a < b && b < c ) ) {

            throw new IllegalArgumentException( "The given values do not define a valid pythagorean triplet." );

        }

        this.a = a;

        this.b = b;

        this.c = c;

    }

    public static PythagoreanTripletListBuilder makeTripletsList( ) {

        return new PythagoreanTripletListBuilder( );

    }

    @Override

    public boolean equals( final Object obj ) {

        if ( !( obj instanceof PythagoreanTriplet ) ) {

            return false;

        }

        final PythagoreanTriplet other = ( PythagoreanTriplet ) obj;

        return a == other.a && b == other.b && c == other.c;

    }

    @Override

    public int hashCode( ) {

        int hc = 17;

        final int hashMultiplier = 59;

        hc = hc * hashMultiplier + a;
        hc = hc * hashMultiplier + b;

        hc = hc * hashMultiplier + c;

        return hc;
    }

    public static final class PythagoreanTripletListBuilder {

        private int maxFactors;

        private int sum;

        public PythagoreanTripletListBuilder withFactorsLessThanOrEqualTo( final int maxFactors ) {

            this.maxFactors = maxFactors;

            return this;

        }

        public PythagoreanTripletListBuilder thatSumTo( final int sum ) {

            this.sum = sum;

            return this;

        }

        public List<PythagoreanTriplet> build( ) {

            if ( maxFactors <= 0 || sum <= 0 ) {

                throw new IllegalStateException( "maxFactors and/or the sum have not been correctly initialized." );

            }

            final List<PythagoreanTriplet> triplets = new ArrayList<>( );

            for ( int a = 1; a < maxFactors - 4; a++ ) {

                for ( int b = a + 1; b < maxFactors - 3; b++ ) {

                    final int c = sum - a - b;

                    if ( a * a + b * b == c * c ) {

                        triplets.add( new PythagoreanTriplet( a, b, c ) );

                    }

                }

            }

            return triplets;

        }

    }

}