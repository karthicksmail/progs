#!C:/Strawberry/perl/bin/perl.exe

use strict;
use warnings;

sub print_file
{
	my ($file) = @_;
	if (! -d $file)
	{
		open(FILE, $file) || die "Unable to open $file";
		my @lines = <FILE>;
		print "@lines";
	}
}

sub list_files
{
	my ($dir) = @_;
	my @files = glob "$dir/*";
	foreach my $file (@files)
	{
		&print_file($file);
	}
}

sub print_dir
{
	my (@dirs) = @_;
	foreach my $dir (@dirs)
	{
		&list_files($dir);
	}
}

&print_dir(@ARGV);

