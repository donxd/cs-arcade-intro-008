int matrixElementsSum(int[][] matrix) {
    boolean [] validColumns = getArrayValidColumns( matrix[ 0 ] );
    int total = 0;
    
    for ( int i = 0; i < matrix.length; i++ ){
        for ( int j = 0; j < validColumns.length; j++ ){
            if ( validColumns[ j ] ){
                if ( matrix[ i ][ j ] != 0 ){
                    total += matrix[ i ][ j ];
                } else {
                    validColumns[ j ] = false;
                }
            }
        }
    }
    
    return total;
}

boolean [] getArrayValidColumns ( int [] array ){
    boolean [] columns = new boolean[ array.length ];
    for ( int i = 0; i < array.length; i++ ){
        columns[ i ] = true;
    }
    
    return columns;
}