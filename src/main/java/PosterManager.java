public class PosterManager {
    private String[] posters = new String[0];
    private int limit;

    public PosterManager() {
        this.limit = 10;

    }

    public PosterManager(int Limit) {
        this.limit = limit;

    }

    public void add(String poster) {
        String[] tmp = new String[posters.length + 1];
        for (int i = 0; i < posters.length; i++) {
            tmp[i] = posters[i];
        }
        tmp[tmp.length - 1] = poster;
        posters = tmp;
    }

    public String[] findAll() {
        return posters;
    }

    public String[] findALast() {
        int resultLength;
        if (posters.length < limit) {
            resultLength = posters.length;
        } else {
            resultLength = limit;
        }
        String[] tmp = new String[resultLength];
        for (int i = 0; i < posters.length; i++) {
            posters[i] = posters[posters.length - 1 - i];
        }
        return posters;
    }
}
