" this is the autoindent code for java
set autoindent
set si
set shiftwidth=4
set cinoptions+=j1
set nohls
" To display the line numbers
set number
" Mapping F5 to automatically compile and delete the made class file
map <F5> : !~/java_files/java_compile %<Return>
"  to cycle through errors
autocmd Filetype java set makeprg=javac\ %
set errorformat=%A%f:%l:\ %m,%-Z%p^,%-C%.%#
map <F9> :make<Return>:copen<Return>
map <F10> :cprevious<Return>
map <F11> :cnext<Return>
