package hello;

import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by uengine on 2018. 1. 6..
 */
//@RepositoryRestResource
public interface CourseRepository extends PagingAndSortingRepository<Course, Long> {
}
