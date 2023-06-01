package cart.dto.response;

import cart.domain.Product;

public class ProductResponse {
    private final Long id;
    private final String name;
    private final int price;
    private final String imageUrl;

    private ProductResponse(final Long id, final String name, final int price, final String imageUrl) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.imageUrl = imageUrl;
    }

    public static ProductResponse of(final Product product) {
        return new ProductResponse(product.getId(), product.getName(), product.getPrice(), product.getImageUrl());
    }

    public static ProductResponse deleted() {
        return new ProductResponse(0L, "deleted", 0, "deleted");
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getImageUrl() {
        return imageUrl;
    }
}
