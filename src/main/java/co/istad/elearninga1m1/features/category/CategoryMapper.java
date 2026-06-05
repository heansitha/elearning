package co.istad.elearninga1m1.features.category;


import co.istad.elearninga1m1.features.category.dto.CategoryResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
interface CategoryMapper {

    Category categoryRequestToCategory(CategoryRequest categoryRequest);

    CategoryResponse categoryToCategoryResponse(Category category);

}
