package com.doosane.myselectshop.repository;

import com.doosane.myselectshop.entity.Folder;
import com.doosane.myselectshop.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FolderRepository extends JpaRepository<Folder, Integer> {

    List<Folder> findAllByUserAndNameIn(User user, List<String> folderNames);
    // select * from folder where user_id = ? and name in ('1', '2', '3');

    List<Folder> findAllByUser(User user);





}
