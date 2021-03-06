package creativei.service;

import creativei.entity.Branch;

import java.util.List;

/**
 * Created by Aayush on 12/15/2017.
 */
public interface BranchService {
    List<Branch> getAll();
    Branch create(Branch branch);
    Branch getById(Long id);
    Branch getByName(String name);
    Branch createAll(List<Branch> branches);
    Branch update(Branch branch);
    Branch updateAll(List<Branch> branches);

}
